package com.atul.java.patterns.behavioral.chainOfResponsibility._2;

public class Demo {
	public static void main(String[] args) {

	    OtolaryngologySurgeon otolarynS = new OtolaryngologySurgeon();
	    VascularSurgeon vacularS = new VascularSurgeon();
	    CardiothoracicSurgeon cardioS = new CardiothoracicSurgeon();

	    //chain
	    otolarynS.setNext(vacularS);
	    vacularS.setNext(cardioS);

	    SurgicalRequest heartRequest = new SurgicalRequest(
	            "Jackie",
	            "Chan",
	            Specialties.Heart
	    );

	    System.out.println("\n-----heart request-----");
	    otolarynS.operate(heartRequest);

	    SurgicalRequest bladderRequest = new SurgicalRequest(
	            "Jet",
	            "Lee",
	            Specialties.Bladder
	    );

	    System.out.println("\n-----bladder request-----");
	    otolarynS.operate(bladderRequest);

	}
}
