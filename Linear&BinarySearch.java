import javax.swing.JOptionPane;

public class Linear_Binary_Search {

    public static void main(String[] args) {

        int i;

        int n;
        String s;

        s = JOptionPane.showInputDialog("Input the size of your array>>>>");

        n = Integer.parseInt(s);

        int[] a = new int[n];
        int j = 0;
        for (i = 0; i < n; i++) {
            j = i + 1;
            s = JOptionPane.showInputDialog("Item no " + j + " >>>");
            ;

            a[i] = Integer.parseInt(s);

        }

        int f = 0;

        for (i = 0; i < n - 1; i++) {

            if (a[i] <= a[i + 1]) {
                f = 1;

            } else {

                f = 0;
                break;
            }
        }

        int item;

        s = JOptionPane.showInputDialog("\n\nEnter Your Desired item>>>>>");

        item = Integer.parseInt(s);

        if (f == 1) {

            JOptionPane.showMessageDialog(null ,"\n\n******Your Array is sorted****** \n");
            JOptionPane.showMessageDialog(null ,"\n\nNow Start Binary Search...............\n");

        } else {
            JOptionPane.showMessageDialog(null ,"\n\n******Your Array is not  sorted****** \n");
            JOptionPane.showMessageDialog(null ,"\n\nNow Start Linear Search...............\n");
        }

        if (f == 1) {
            int left_index = 0;
            int right_index = n - 1;

            int mid = (left_index + right_index) / 2;

            while (left_index <= right_index) {

                if (a[mid] == item) {

                    JOptionPane.showMessageDialog(null ,"\n\nThe item is found!!!\n");
                    JOptionPane.showMessageDialog(null ,"\n\nThe item is at " + mid + " th index in this array.\n\n");

                    return ;
                } else if (item < a[mid]) {

                    right_index = mid - 1;
                } else {
                    left_index = mid + 1;

                }
                mid = (left_index + right_index) / 2;

            }
            JOptionPane.showMessageDialog(null ,"\n\nThe item is not found in this array.!!!!!\n\n");

        } else {
            for (i = 0; i < n; i++) {
                if (a[i] == item) {

                    JOptionPane.showMessageDialog(null ,"\n\nThe item is found!!!\n");
                    JOptionPane.showMessageDialog(null ,"\n\nThe item is at " + i + " th index in this array.\n\n");
                    return ;

                }
            }
            JOptionPane.showMessageDialog(null ,"\n\nThe item is not found in this array.!!!!!\n\n");
        }
    }
}
