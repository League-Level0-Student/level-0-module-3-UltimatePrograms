import javax.swing.JOptionPane;

public class happy {
	public static void main(String[] args) {
		String hap = JOptionPane.showInputDialog("Are you happy?");
		if (hap.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
			System.exit(0);
		}
		if (hap.equalsIgnoreCase("no")) {
			String d = JOptionPane.showInputDialog("Do you want to be happy?");
			if (d.equalsIgnoreCase("no")) {
				JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
				System.exit(0);
			}

			if (d.equalsIgnoreCase("yes")) {
				JOptionPane.showMessageDialog(null, "Change something.");

			}

		}
	}
}
