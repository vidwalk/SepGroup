import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTabbedPane;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JList;
import javax.swing.JDesktopPane;
import javax.swing.JTextField;
import javax.swing.DropMode;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.UIManager;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUIJava
{

   private JFrame frmEventsAndMembers;
   private JTextField txtEventToEdit;
   private JTextField textField;
   private JTextField textField_1;
   private JTextField textField_2;
   private JTextField textField_3;
   private JTextField textField_4;
   private JTextField textField_5;
   private JTextField textField_6;
   private JTextField textField_7;
   private JTextField textField_8;
   private JLabel lblNewLabel;
   private JLabel lblNewLabel_1;
   private JLabel lblLength;
   private JLabel lblNewLabel_2;
   private JLabel lblNewLabel_3;
   private JLabel lblType;
   private JLabel lblVeganFood;
   private JLabel lblNewLabel_4;
   private JLabel lblSearchEvent;
   private JTextField textField_9;
   private JTextField textField_11;
   private JTextField textField_12;
   private JTextField textField_13;
   private JPanel panel_2;
   private JLabel lblName_1;
   private JLabel lblNewLabel_5;
   private JLabel lblNewLabel_6;
   private JLabel lblNewLabel_7;
   private JTextField textField_14;
   private JTextField textField_15;
   private JTextField textField_16;
   private JPanel panel_5;
   private JLabel lblName_2;
   private JLabel lblEmailAdress;
   private JLabel lblCategory;
   private JPanel panel_6;
   private JTextField textField_10;
   private JTextField textField_17;
   private JTextField textField_18;
   private JTextField textField_19;
   private JTextField textField_20;
   private JTextField textField_21;
   private JTextField textField_22;
   private JTextField txtInputLecturer;
   private JTextField txtInputSponsor;
   private JTextField textField_23;
   private JTextField textField_24;
   private JTextField textField_25;
   private JTextField textField_26;
   private JTextField textField_27;
   private JTextField textField_28;
   private JPanel panel_13;
   private JButton btnSearch_1;
   private JTextField textField_29;
   private JTextField textField_30;
   private JTextField textField_31;
   private JLabel lblDay;
   private JLabel lblMonth;
   private JLabel lblYear;
   private JPanel panel_14;
   private JButton btnCreateMember;
   private JTextField textField_32;
   private JTextField textField_33;
   private JTextField textField_34;
   private JTextField textField_35;
   private JTextField textField_36;
   private JTextField textField_37;
   private JTextField textField_38;
   private JTextField textField_39;
   private JTextField textField_40;
   private JLabel lblName_3;
   private JLabel lblEmailAdress_1;
   private JLabel lblAdress;
   private JLabel lblNewLabel_11;
   private JLabel lblNewLabel_12;
   private JLabel lblCategory_1;
   private JLabel lblDay_1;
   private JLabel lblMonth_1;
   private JLabel lblYear_1;
   private JPanel panel_15;
   private JPanel panel_16;
   private JButton btnSubmit_1;
   private JButton btnListByEmails;
   private JButton btnListByPreference;
   private JTextField txtPreference;
   private JLabel lblPreference;
   private JButton btnListIfNot;
   private JLabel lblListThoseWho;
   private JTextField textField_41;

   /**
    * Launch the application.
    */
   public static void main(String[] args)
   {
      EventQueue.invokeLater(new Runnable()
      {
         public void run()
         {
            try
            {
               GUIJava window = new GUIJava();
               window.frmEventsAndMembers.setVisible(true);
            }
            catch (Exception e)
            {
               e.printStackTrace();
            }
         }
      });
   }

   /**
    * Create the application.
    */
   public GUIJava()
   {
      initialize();
   }

   /**
    * Initialize the contents of the frame.
    */
   private void initialize()
   {
      frmEventsAndMembers = new JFrame();
      frmEventsAndMembers.setFont(new Font("Arial Black", Font.PLAIN, 12));
      frmEventsAndMembers.setTitle("Events and Members Management System");
      frmEventsAndMembers.setBounds(100, 100, 922, 612);
      frmEventsAndMembers.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frmEventsAndMembers.getContentPane().setLayout(null);
      
      JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
      tabbedPane.setBounds(0, 0, 906, 583);
      frmEventsAndMembers.getContentPane().add(tabbedPane);
      
      JPanel panel = new JPanel();
      tabbedPane.addTab("Events", null, panel, null);
      panel.setLayout(null);
      
      JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
      tabbedPane_1.setBounds(0, 0, 901, 553);
      panel.add(tabbedPane_1);
      
      JPanel panel_3 = new JPanel();
      tabbedPane_1.addTab("Manage Event", null, panel_3, null);
      panel_3.setLayout(null);
      
      JButton btnCreateEvent = new JButton("Create Event");
      btnCreateEvent.setBounds(43, 32, 109, 23);
      panel_3.add(btnCreateEvent);
      
      panel_6 = new JPanel();
      panel_6.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Edit Event", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
      panel_6.setBounds(37, 70, 849, 423);
      panel_3.add(panel_6);
      panel_6.setLayout(null);
      
      txtEventToEdit = new JTextField();
      txtEventToEdit.setBounds(6, 30, 141, 20);
      panel_6.add(txtEventToEdit);
      txtEventToEdit.setText("Event To Edit/Remove");
      txtEventToEdit.setColumns(10);
      
      textField = new JTextField();
      textField.setBounds(6, 90, 86, 20);
      panel_6.add(textField);
      textField.setColumns(10);
      
      textField_1 = new JTextField();
      textField_1.setBounds(128, 90, 86, 20);
      panel_6.add(textField_1);
      textField_1.setColumns(10);
      
      textField_2 = new JTextField();
      textField_2.setBounds(264, 90, 86, 20);
      panel_6.add(textField_2);
      textField_2.setColumns(10);
      
      textField_3 = new JTextField();
      textField_3.setBounds(407, 90, 86, 20);
      panel_6.add(textField_3);
      textField_3.setColumns(10);
      
      textField_4 = new JTextField();
      textField_4.setBounds(539, 90, 86, 20);
      panel_6.add(textField_4);
      textField_4.setColumns(10);
      
      textField_5 = new JTextField();
      textField_5.setBounds(6, 155, 86, 20);
      panel_6.add(textField_5);
      textField_5.setColumns(10);
      
      textField_6 = new JTextField();
      textField_6.setBounds(128, 155, 86, 20);
      panel_6.add(textField_6);
      textField_6.setColumns(10);
      
      textField_7 = new JTextField();
      textField_7.setBounds(264, 155, 86, 20);
      panel_6.add(textField_7);
      textField_7.setColumns(10);
      
      textField_8 = new JTextField();
      textField_8.setBounds(407, 155, 86, 20);
      panel_6.add(textField_8);
      textField_8.setColumns(10);
      
      JLabel lblName = new JLabel("Name");
      lblName.setBounds(30, 73, 46, 14);
      panel_6.add(lblName);
      
      lblNewLabel = new JLabel("Number of Participants");
      lblNewLabel.setBounds(107, 73, 141, 14);
      panel_6.add(lblNewLabel);
      
      lblNewLabel_1 = new JLabel("Number of Members");
      lblNewLabel_1.setBounds(257, 73, 119, 14);
      panel_6.add(lblNewLabel_1);
      
      lblLength = new JLabel("Length");
      lblLength.setBounds(434, 73, 46, 14);
      panel_6.add(lblLength);
      
      lblNewLabel_2 = new JLabel("Discount");
      lblNewLabel_2.setBounds(560, 73, 65, 14);
      panel_6.add(lblNewLabel_2);
      
      lblNewLabel_3 = new JLabel("Finalized");
      lblNewLabel_3.setBounds(30, 140, 62, 14);
      panel_6.add(lblNewLabel_3);
      
      lblType = new JLabel("Type of Event");
      lblType.setBounds(140, 140, 96, 14);
      panel_6.add(lblType);
      
      lblVeganFood = new JLabel("Vegan Food*");
      lblVeganFood.setBounds(274, 140, 86, 14);
      panel_6.add(lblVeganFood);
      
      lblNewLabel_4 = new JLabel("Location");
      lblNewLabel_4.setBounds(423, 140, 70, 14);
      panel_6.add(lblNewLabel_4);
      
      lblSearchEvent = new JLabel("Search Event");
      lblSearchEvent.setBounds(16, 16, 86, 14);
      panel_6.add(lblSearchEvent);
      
      panel_2 = new JPanel();
      panel_2.setBounds(6, 275, 499, 64);
      panel_6.add(panel_2);
      panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Lecturer", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
      panel_2.setLayout(null);
      
      textField_9 = new JTextField();
      textField_9.setBounds(10, 33, 86, 20);
      panel_2.add(textField_9);
      textField_9.setColumns(10);
      
      textField_11 = new JTextField();
      textField_11.setBounds(132, 33, 86, 20);
      panel_2.add(textField_11);
      textField_11.setColumns(10);
      
      textField_12 = new JTextField();
      textField_12.setBounds(268, 33, 86, 20);
      panel_2.add(textField_12);
      textField_12.setColumns(10);
      
      textField_13 = new JTextField();
      textField_13.setBounds(403, 33, 86, 20);
      panel_2.add(textField_13);
      textField_13.setColumns(10);
      
      lblName_1 = new JLabel("Name");
      lblName_1.setBounds(39, 18, 46, 14);
      panel_2.add(lblName_1);
      
      lblNewLabel_5 = new JLabel("Paid for");
      lblNewLabel_5.setBounds(156, 18, 46, 14);
      panel_2.add(lblNewLabel_5);
      
      lblNewLabel_6 = new JLabel("Email Adress");
      lblNewLabel_6.setBounds(279, 18, 66, 14);
      panel_2.add(lblNewLabel_6);
      
      lblNewLabel_7 = new JLabel("Category");
      lblNewLabel_7.setBounds(420, 18, 69, 14);
      panel_2.add(lblNewLabel_7);
      
      panel_5 = new JPanel();
      panel_5.setBounds(6, 352, 356, 64);
      panel_6.add(panel_5);
      panel_5.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Sponsor", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
      panel_5.setLayout(null);
      
      textField_14 = new JTextField();
      textField_14.setBounds(10, 33, 86, 20);
      panel_5.add(textField_14);
      textField_14.setColumns(10);
      
      textField_15 = new JTextField();
      textField_15.setBounds(128, 33, 86, 20);
      panel_5.add(textField_15);
      textField_15.setColumns(10);
      
      textField_16 = new JTextField();
      textField_16.setBounds(260, 33, 86, 20);
      panel_5.add(textField_16);
      textField_16.setColumns(10);
      
      lblName_2 = new JLabel("Name");
      lblName_2.setBounds(40, 18, 46, 14);
      panel_5.add(lblName_2);
      
      lblEmailAdress = new JLabel("Email Adress");
      lblEmailAdress.setBounds(138, 18, 86, 14);
      panel_5.add(lblEmailAdress);
      
      lblCategory = new JLabel("Category");
      lblCategory.setBounds(269, 18, 66, 14);
      panel_5.add(lblCategory);
      
      JPanel panel_9 = new JPanel();
      panel_9.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Feedback", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
      panel_9.setBounds(10, 202, 260, 72);
      panel_6.add(panel_9);
      panel_9.setLayout(null);
      
      JTextArea textArea = new JTextArea();
      textArea.setWrapStyleWord(true);
      textArea.setLineWrap(true);
      textArea.setColumns(1);
      textArea.setBounds(6, 16, 248, 49);
      panel_9.add(textArea);
      
      JButton btnSubmit = new JButton("Submit");
      btnSubmit.setBounds(463, 389, 89, 23);
      panel_6.add(btnSubmit);
      
      panel_14 = new JPanel();
      panel_14.setBorder(new TitledBorder(null, "Starting Day", TitledBorder.LEADING, TitledBorder.TOP, null, null));
      panel_14.setBounds(635, 55, 202, 111);
      panel_6.add(panel_14);
      panel_14.setLayout(null);
      
      textField_29 = new JTextField();
      textField_29.setBounds(10, 35, 86, 20);
      panel_14.add(textField_29);
      textField_29.setColumns(10);
      
      textField_30 = new JTextField();
      textField_30.setBounds(106, 35, 86, 20);
      panel_14.add(textField_30);
      textField_30.setColumns(10);
      
      textField_31 = new JTextField();
      textField_31.setBounds(10, 80, 86, 20);
      panel_14.add(textField_31);
      textField_31.setColumns(10);
      
      lblDay = new JLabel("Day");
      lblDay.setBounds(40, 22, 46, 14);
      panel_14.add(lblDay);
      
      lblMonth = new JLabel("Month");
      lblMonth.setBounds(130, 22, 46, 14);
      panel_14.add(lblMonth);
      
      lblYear = new JLabel("Year");
      lblYear.setBounds(40, 66, 46, 14);
      panel_14.add(lblYear);
      
      JButton btnRemove = new JButton("Remove");
      btnRemove.setBounds(580, 389, 89, 23);
      panel_6.add(btnRemove);
      
      JPanel panel_4 = new JPanel();
      tabbedPane_1.addTab("Search Events", null, panel_4, null);
      panel_4.setLayout(null);
      
      textField_23 = new JTextField();
      textField_23.setBounds(59, 85, 86, 20);
      panel_4.add(textField_23);
      textField_23.setColumns(10);
      
      textField_24 = new JTextField();
      textField_24.setBounds(219, 85, 86, 20);
      panel_4.add(textField_24);
      textField_24.setColumns(10);
      
      textField_25 = new JTextField();
      textField_25.setBounds(383, 85, 86, 20);
      panel_4.add(textField_25);
      textField_25.setColumns(10);
      
      JLabel lblNewLabel_8 = new JLabel("Category");
      lblNewLabel_8.setBounds(77, 68, 68, 14);
      panel_4.add(lblNewLabel_8);
      
      JLabel lblNewLabel_9 = new JLabel("Non Finalized");
      lblNewLabel_9.setBounds(229, 68, 76, 14);
      panel_4.add(lblNewLabel_9);
      
      JLabel lblNewLabel_10 = new JLabel("Finalized");
      lblNewLabel_10.setBounds(400, 68, 69, 14);
      panel_4.add(lblNewLabel_10);
      
      btnSearch_1 = new JButton("Search");
      btnSearch_1.setBounds(56, 147, 89, 23);
      panel_4.add(btnSearch_1);
      
      JPanel panel_10 = new JPanel();
      tabbedPane_1.addTab("Lecturer and Sponsor", null, panel_10, null);
      panel_10.setLayout(null);
      
      JPanel panel_11 = new JPanel();
      panel_11.setLayout(null);
      panel_11.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Lecturer", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
      panel_11.setBounds(57, 105, 499, 64);
      panel_10.add(panel_11);
      
      textField_10 = new JTextField();
      textField_10.setColumns(10);
      textField_10.setBounds(10, 33, 86, 20);
      panel_11.add(textField_10);
      
      textField_17 = new JTextField();
      textField_17.setColumns(10);
      textField_17.setBounds(132, 33, 86, 20);
      panel_11.add(textField_17);
      
      textField_18 = new JTextField();
      textField_18.setColumns(10);
      textField_18.setBounds(268, 33, 86, 20);
      panel_11.add(textField_18);
      
      textField_19 = new JTextField();
      textField_19.setColumns(10);
      textField_19.setBounds(403, 33, 86, 20);
      panel_11.add(textField_19);
      
      JLabel label = new JLabel("Name");
      label.setBounds(39, 18, 46, 14);
      panel_11.add(label);
      
      JLabel label_1 = new JLabel("Paid for");
      label_1.setBounds(156, 18, 46, 14);
      panel_11.add(label_1);
      
      JLabel label_2 = new JLabel("Email Adress");
      label_2.setBounds(279, 18, 95, 14);
      panel_11.add(label_2);
      
      JLabel label_3 = new JLabel("Category");
      label_3.setBounds(420, 18, 69, 14);
      panel_11.add(label_3);
      
      JPanel panel_12 = new JPanel();
      panel_12.setLayout(null);
      panel_12.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Sponsor", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
      panel_12.setBounds(57, 294, 356, 64);
      panel_10.add(panel_12);
      
      textField_20 = new JTextField();
      textField_20.setColumns(10);
      textField_20.setBounds(10, 33, 86, 20);
      panel_12.add(textField_20);
      
      textField_21 = new JTextField();
      textField_21.setColumns(10);
      textField_21.setBounds(128, 33, 86, 20);
      panel_12.add(textField_21);
      
      textField_22 = new JTextField();
      textField_22.setColumns(10);
      textField_22.setBounds(260, 33, 86, 20);
      panel_12.add(textField_22);
      
      JLabel label_4 = new JLabel("Name");
      label_4.setBounds(40, 18, 46, 14);
      panel_12.add(label_4);
      
      JLabel label_5 = new JLabel("Email Adress");
      label_5.setBounds(144, 18, 92, 14);
      panel_12.add(label_5);
      
      JLabel label_6 = new JLabel("Category");
      label_6.setBounds(280, 18, 76, 14);
      panel_12.add(label_6);
      
      txtInputLecturer = new JTextField();
      txtInputLecturer.setText("Input Lecturer");
      txtInputLecturer.setBounds(57, 56, 86, 20);
      panel_10.add(txtInputLecturer);
      txtInputLecturer.setColumns(10);
      
      JLabel lblSearchLecturer = new JLabel("Search Lecturer");
      lblSearchLecturer.setBounds(57, 31, 106, 14);
      panel_10.add(lblSearchLecturer);
      
      txtInputSponsor = new JTextField();
      txtInputSponsor.setText("Input Sponsor");
      txtInputSponsor.setBounds(57, 263, 86, 20);
      panel_10.add(txtInputSponsor);
      txtInputSponsor.setColumns(10);
      
      JLabel lblSearchSponsor = new JLabel("Search Sponsor");
      lblSearchSponsor.setBounds(57, 238, 106, 14);
      panel_10.add(lblSearchSponsor);
      
      JButton btnSearch = new JButton("Search");
      btnSearch.setBounds(57, 408, 89, 23);
      panel_10.add(btnSearch);
      
      panel_13 = new JPanel();
      panel_13.setBorder(new TitledBorder(null, "Listing by Category", TitledBorder.LEADING, TitledBorder.TOP, null, null));
      panel_13.setBounds(606, 31, 171, 307);
      panel_10.add(panel_13);
      panel_13.setLayout(null);
      
      textField_26 = new JTextField();
      textField_26.setBounds(28, 136, 86, 20);
      panel_13.add(textField_26);
      textField_26.setColumns(10);
      
      JButton btnList = new JButton("List");
      btnList.setBounds(25, 260, 89, 23);
      panel_13.add(btnList);
      
      textField_27 = new JTextField();
      textField_27.setBounds(28, 211, 86, 20);
      panel_13.add(textField_27);
      textField_27.setColumns(10);
      
      JLabel lblCategoryOfLecturers = new JLabel("Category of Lecturers");
      lblCategoryOfLecturers.setBounds(21, 117, 140, 14);
      panel_13.add(lblCategoryOfLecturers);
      
      JLabel lblCategoryOfSponsors = new JLabel("Category of Sponsors");
      lblCategoryOfSponsors.setBounds(21, 191, 140, 14);
      panel_13.add(lblCategoryOfSponsors);
      
      textField_28 = new JTextField();
      textField_28.setBounds(28, 68, 86, 20);
      panel_13.add(textField_28);
      textField_28.setColumns(10);
      
      JLabel lblEvent = new JLabel("Event");
      lblEvent.setBounds(53, 44, 46, 14);
      panel_13.add(lblEvent);
      
      JButton btnRemove_1 = new JButton("Remove");
      btnRemove_1.setBounds(180, 408, 89, 23);
      panel_10.add(btnRemove_1);
      
      JPanel panel_1 = new JPanel();
      tabbedPane.addTab("Member", null, panel_1, null);
      panel_1.setLayout(null);
      
      JTabbedPane tabbedPane_4 = new JTabbedPane(JTabbedPane.TOP);
      tabbedPane_4.setBounds(0, 0, 901, 555);
      panel_1.add(tabbedPane_4);
      
      JPanel panel_7 = new JPanel();
      tabbedPane_4.addTab("Manage Members", null, panel_7, null);
      panel_7.setLayout(null);
      
      btnCreateMember = new JButton("Create Member");
      btnCreateMember.setBounds(45, 53, 132, 23);
      panel_7.add(btnCreateMember);
      
      panel_16 = new JPanel();
      panel_16.setBorder(new TitledBorder(null, "Manage Member", TitledBorder.LEADING, TitledBorder.TOP, null, null));
      panel_16.setBounds(45, 166, 342, 240);
      panel_7.add(panel_16);
      panel_16.setLayout(null);
      
      textField_32 = new JTextField();
      textField_32.setBounds(10, 37, 86, 20);
      panel_16.add(textField_32);
      textField_32.setColumns(10);
      
      textField_33 = new JTextField();
      textField_33.setBounds(132, 37, 86, 20);
      panel_16.add(textField_33);
      textField_33.setColumns(10);
      
      textField_34 = new JTextField();
      textField_34.setBounds(246, 37, 86, 20);
      panel_16.add(textField_34);
      textField_34.setColumns(10);
      
      textField_35 = new JTextField();
      textField_35.setBounds(10, 103, 86, 20);
      panel_16.add(textField_35);
      textField_35.setColumns(10);
      
      textField_36 = new JTextField();
      textField_36.setBounds(132, 103, 86, 20);
      panel_16.add(textField_36);
      textField_36.setColumns(10);
      
      textField_37 = new JTextField();
      textField_37.setBounds(246, 103, 86, 20);
      panel_16.add(textField_37);
      textField_37.setColumns(10);
      
      panel_15 = new JPanel();
      panel_15.setBounds(0, 155, 342, 74);
      panel_16.add(panel_15);
      panel_15.setBorder(new TitledBorder(null, "Register Date", TitledBorder.LEADING, TitledBorder.TOP, null, null));
      panel_15.setLayout(null);
      
      textField_38 = new JTextField();
      textField_38.setBounds(10, 43, 86, 20);
      panel_15.add(textField_38);
      textField_38.setColumns(10);
      
      textField_39 = new JTextField();
      textField_39.setBounds(135, 43, 86, 20);
      panel_15.add(textField_39);
      textField_39.setColumns(10);
      
      textField_40 = new JTextField();
      textField_40.setBounds(246, 43, 86, 20);
      panel_15.add(textField_40);
      textField_40.setColumns(10);
      
      lblDay_1 = new JLabel("Day");
      lblDay_1.setBounds(39, 26, 46, 14);
      panel_15.add(lblDay_1);
      
      lblMonth_1 = new JLabel("Month");
      lblMonth_1.setBounds(158, 26, 46, 14);
      panel_15.add(lblMonth_1);
      
      lblYear_1 = new JLabel("Year");
      lblYear_1.setBounds(274, 26, 46, 14);
      panel_15.add(lblYear_1);
      
      lblName_3 = new JLabel("Name");
      lblName_3.setBounds(37, 19, 46, 14);
      panel_16.add(lblName_3);
      
      lblEmailAdress_1 = new JLabel("Email Adress");
      lblEmailAdress_1.setBounds(144, 19, 98, 14);
      panel_16.add(lblEmailAdress_1);
      
      lblAdress = new JLabel("Adress");
      lblAdress.setBounds(272, 19, 46, 14);
      panel_16.add(lblAdress);
      
      lblNewLabel_12 = new JLabel("Year of Payment");
      lblNewLabel_12.setBounds(132, 89, 110, 14);
      panel_16.add(lblNewLabel_12);
      
      lblCategory_1 = new JLabel("Category");
      lblCategory_1.setBounds(265, 89, 67, 14);
      panel_16.add(lblCategory_1);
      
      lblNewLabel_11 = new JLabel("Telephone Number");
      lblNewLabel_11.setBounds(10, 89, 124, 14);
      panel_16.add(lblNewLabel_11);
      
      btnSubmit_1 = new JButton("Submit");
      btnSubmit_1.setBounds(45, 460, 89, 23);
      panel_7.add(btnSubmit_1);
      
      textField_41 = new JTextField();
      textField_41.setBounds(513, 54, 86, 20);
      panel_7.add(textField_41);
      textField_41.setColumns(10);
      
      JLabel lblSelectMember = new JLabel("Select Member");
      lblSelectMember.setBounds(525, 33, 105, 20);
      panel_7.add(lblSelectMember);
      
      JButton btnRemove_2 = new JButton("Remove");
      btnRemove_2.setBounds(505, 100, 105, 23);
      panel_7.add(btnRemove_2);
      
      JPanel panel_8 = new JPanel();
      tabbedPane_4.addTab("List Members", null, panel_8, null);
      panel_8.setLayout(null);
      
      btnListByEmails = new JButton("List all by Emails");
      btnListByEmails.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
         }
      });
      btnListByEmails.setBounds(63, 56, 140, 23);
      panel_8.add(btnListByEmails);
      
      btnListByPreference = new JButton("List By Preference");
      btnListByPreference.setBounds(62, 166, 141, 23);
      panel_8.add(btnListByPreference);
      
      txtPreference = new JTextField();
      txtPreference.setText("e.g. Astrology");
      txtPreference.setBounds(62, 124, 86, 20);
      panel_8.add(txtPreference);
      txtPreference.setColumns(10);
      
      lblPreference = new JLabel("Preference");
      lblPreference.setBounds(83, 106, 68, 14);
      panel_8.add(lblPreference);
      
      btnListIfNot = new JButton("List If Not Paid");
      btnListIfNot.setBounds(63, 261, 123, 23);
      panel_8.add(btnListIfNot);
      
      lblListThoseWho = new JLabel("List Those Who Did Not Pay");
      lblListThoseWho.setBounds(58, 240, 157, 14);
      panel_8.add(lblListThoseWho);
   }
}
