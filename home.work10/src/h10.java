import javax.swing.JOptionPane;
public class h10
{
    public static void main(String[] args)
    {
        String name;
                name= JOptionPane.showInputDialog("What Is Your Name?");
        System.out.println("My Name Is "+name);
        JOptionPane.showMessageDialog(null,"My Name Is Mohammed How Can I Help You?");
       JOptionPane.showMessageDialog(null,"Sorry "+name+" I Can Not Help You Now ]:");
    }
}
