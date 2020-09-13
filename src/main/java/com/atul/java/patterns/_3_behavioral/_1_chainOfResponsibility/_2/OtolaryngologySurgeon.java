package com.atul.java.patterns._3_behavioral._1_chainOfResponsibility._2;

public class OtolaryngologySurgeon extends Surgeon {
    @Override
    public void operate(SurgicalRequest request) {
        Specialties specialty = request.getSpecialty();
        if (specialty == Specialties.Head
                || specialty == Specialties.Neck
                || specialty == Specialties.Voice
                || specialty == Specialties.Ear
                || specialty == Specialties.Nose)
        {
            System.out.println(
                String.format("The %s will operate on %s %s. Request approved",
                        this.getClass().getSimpleName(),
                        request.getFirstname(),
                        request.getLastname())
            );
        }
        else{
            if(nextSurgeon != null){
                System.out.println(
                        String.format("%s cannot operate on patient %s %s. Passing request to %s...",
                                this.getClass().getSimpleName(),
                                request.getFirstname(),
                                request.getLastname(),
                                nextSurgeon.getClass().getSimpleName())
                );

                nextSurgeon.operate(request);
            }
            else{
                System.out.println(
                        String.format("Could not find a surgeon who specializes in %s. Request rejected.",
                                request.getSpecialty()));
            }
        }
    }
}