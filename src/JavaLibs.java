import javax.swing.JOptionPane;

public class JavaLibs {

    public static void main(String[] args) {

        String input1 = (String)JOptionPane.showInputDialog(null,
                "Type your Name",
                "(1/10) Survey",
                2,
                null,
                null,
                "name");
//double below, casts later
        String input2 = (String)JOptionPane.showInputDialog(null,
                "Enter Birthday as decimal [month.day]",
                "(2/10) Survey",
                2,
                null,
                null,
                "1.1");

        double input22 = Double.parseDouble(input2);
        input22++;

//int below, cast later
        String input3 = (String)JOptionPane.showInputDialog(null,
                "Enter Age",
                "(3/10) Survey",
                2,
                null,
                null,
                "99");

        int input33 = Integer.parseInt(input3);
        input33++;

        String input4 = (String)JOptionPane.showInputDialog(null,
                "Enter Home Address",
                "(4/10) Survey",
                2,
                null,
                null,
                "23 Fever Rd.");

        String input5 = (String)JOptionPane.showInputDialog(null,
                "Enter Social Security Number.",
                "(5/10) Survey",
                2,
                null,
                null,
                "329827915");

        String input6 = (String)JOptionPane.showInputDialog(null,
                "Enter Credit Card Provider",
                "(6/10) Survey",
                2,
                null,
                null,
                "Visa");

        String input7 = (String)JOptionPane.showInputDialog(null,
                "Type Security code",
                "(7/10) Survey",
                2,
                null,
                null,
                "913");

        String input8 = (String)JOptionPane.showInputDialog(null,
                "Enter Current Employer",
                "(8/10) Survey",
                2,
                null,
                null,
                "Cuzinos");

        String input9 = (String)JOptionPane.showInputDialog(null,
                "How long have you been living at "+input4+"? [in years]",
                "(9/10) Survey",
                2,
                null,
                null,
                "4");

        String[] acceptableValues = {"Yes", "No", "Unsure"};
        String input10 = (String)JOptionPane.showInputDialog(null,
                "Are you alone in your home?",
                "(10/10) Survey",
                2,
                null,
                acceptableValues,
                acceptableValues[1]);

        JOptionPane.showMessageDialog(null,
                "Hello! my name is "+input1+"! I am "+input3+" years old! which means i'll be "+input33+" in "+input2+".23! I have Jury Duty on "+input22+".23 ",
                "Story:",
                3);

// 1string 1int 1double 1input in question, math int,double 10inputs







    }
}