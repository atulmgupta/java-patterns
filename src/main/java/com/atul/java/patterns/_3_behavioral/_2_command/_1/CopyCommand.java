package com.atul.java.patterns._3_behavioral._2_command._1;

public class CopyCommand extends Command{
	 public CopyCommand(Editor editor) {
	        super(editor);
	    }

	    @Override
	    public boolean execute() {
	        editor.clipboard = editor.textField.getSelectedText();
	        return false;
	    }
}
