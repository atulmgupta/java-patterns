package com.atul.java.patterns.behavioral.command._1;

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