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
import javax.swing.JOptionPane;
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
import javax.swing.JTextPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class GuiMember
{

   private JFrame frmEventsAndMembers;
   private JTextField txtEventToEdit;
   private JTextField eventNameText;
   private JTextField eventNrOfParticipantsText;
   private JTextField eventNrOfMembersText;
   private JTextField eventLengthText;
   private JTextField eventDiscountText;
   private JTextField eventFinalizedText;
   private JTextField eventTypeOfEventText;
   private JTextField eventVeganFoodText;
   private JTextField eventLocationText;
   private JLabel lblNewLabel;
   private JLabel lblNewLabel_1;
   private JLabel lblLength;
   private JLabel lblNewLabel_2;
   private JLabel lblNewLabel_3;
   private JLabel lblType;
   private JLabel lblVeganFood;
   private JLabel lblNewLabel_4;
   private JLabel lblSearchEvent;
   private JTextField lecturerNameText;
   private JTextField lecturerPaidForText;
   private JTextField lecturerEmailAdText;
   private JTextField lecturerCategoryText;
   private JPanel panel_2;
   private JLabel lblName_1;
   private JLabel lblNewLabel_5;
   private JLabel lblNewLabel_6;
   private JLabel lblNewLabel_7;
   private JTextField sponsorNameText;
   private JTextField sponsorEmailAdText;
   private JTextField sponsorCategoryText;
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
   private JTextField dayText;
   private JTextField monthText;
   private JTextField yearText;
   private JLabel lblDay;
   private JLabel lblMonth;
   private JLabel lblYear;
   private JPanel panel_14;
   private JButton btnCreateMember;
   private JTextField memberNameText;
   private JTextField memberEmailText;
   private JTextField memberAddressText;
   private JTextField memberPhoneText;
   private JTextField memberYearOfPeymentText;
   private JTextField memberCategoryText;
   private JLabel lblName_3;
   private JLabel lblEmailAdress_1;
   private JLabel lblAdress;
   private JLabel lblNewLabel_11;
   private JLabel lblNewLabel_12;
   private JLabel lblCategory_1;
   private JPanel panel_16;
   private JButton btnListByEmails;
   private JButton btnListByPreference;
   private JTextField membersPreferenceText;
   private JLabel lblPreference;
   private JButton btnListIfNotPaid;
   private JLabel lblListThoseWho;
   private JTextField memberSelectText;
   private JTextArea listsTextArea;
   private JButton btnSelectMember;
   private JButton btnSaveMember;
   private MainController main;
   private JButton btnRemoveMember;
   private Date date ;
   private JTextField memberRegistrationDateTextField;


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
               GuiMember window = new GuiMember();
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
   public GuiMember()
   {
      initialize();
      registerEventHandlers();
   }

   public void registerEventHandlers()
   {
      btnCreateMember.addActionListener(
            new ActionListener(){public void actionPerformed(
                  ActionEvent event){

               main = new MainController();
               date = new Date();
               Member member = new Member(memberNameText.getText(),memberEmailText.getText(),memberAddressText.getText(),memberPhoneText.getText(),date,Integer.parseInt(memberYearOfPeymentText.getText()),memberCategoryText.getText());
               main.createMember(member);

            }});;
            btnListByEmails.addActionListener(new ActionListener() {
               public void actionPerformed(ActionEvent event) {
                  main = new MainController();

                  listsTextArea.setText(""+main.listMembersByEmails());
//                  scroll down to bottom
                  listsTextArea.setCaretPosition(listsTextArea.getDocument().getLength());


               }
            });

            btnListByPreference.addActionListener(new ActionListener() {
               public void actionPerformed(ActionEvent event) {
                  main = new MainController();

                  listsTextArea.setText(""+main.listMembersByPreference(membersPreferenceText.getText()));
//                  scroll down to bottom
                  listsTextArea.setCaretPosition(listsTextArea.getDocument().getLength());


               }
            });

            btnListIfNotPaid.addActionListener(new ActionListener() {
               public void actionPerformed(ActionEvent event) {
                  main = new MainController();

                  listsTextArea.setText(""+main.listMembersIfNotPaid());
//                  scroll down to bottom
                  listsTextArea.setCaretPosition(listsTextArea.getDocument().getLength());


               }
            });
            btnSelectMember.addActionListener(new ActionListener() {
               public void actionPerformed(ActionEvent event) {
                  main = new MainController();
                  try
                  {
                     Member member = main.selectMemberByName(memberSelectText.getText());
                     memberNameText.setText(member.getName());
                     memberEmailText.setText(member.getEmail());
                     memberPhoneText.setText(member.getPhone());
                     memberAddressText.setText(member.getAdress());
                     memberPhoneText.setText(member.getPhone()+"");
                     memberCategoryText.setText(member.getCategory());
                     memberYearOfPeymentText.setText(member.getYearPayment()+"");
                     memberRegistrationDateTextField.setText(member.getRegisterDate().toString());
                     date = new Date();


                  }
                  catch(NullPointerException e)
                  {

                     JOptionPane.showMessageDialog(frmEventsAndMembers, "There is no such member.");

                  }

               }
            });

            btnSaveMember.addActionListener(new ActionListener() {
               public void actionPerformed(ActionEvent event) {
                  main = new MainController();




                  Member member = main.selectMemberByName(memberNameText.getText());
                  date = member.getRegisterDate();
                  main.removeMember(memberNameText.getText());
                  member = new Member(memberNameText.getText(),memberEmailText.getText(),memberAddressText.getText(),memberPhoneText.getText(),date,Integer.parseInt(memberYearOfPeymentText.getText()),memberCategoryText.getText());
                  main.createMember(member);


               }
            });

            btnRemoveMember.addActionListener(new ActionListener() {
               public void actionPerformed(ActionEvent event) {
                  main = new MainController();

                  main.removeMember(memberNameText.getText());




               }
            });
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

      eventNameText = new JTextField();
      eventNameText.setBounds(6, 90, 86, 20);
      panel_6.add(eventNameText);
      eventNameText.setColumns(10);

      eventNrOfParticipantsText = new JTextField();
      eventNrOfParticipantsText.setBounds(128, 90, 86, 20);
      panel_6.add(eventNrOfParticipantsText);
      eventNrOfParticipantsText.setColumns(10);

      eventNrOfMembersText = new JTextField();
      eventNrOfMembersText.setBounds(264, 90, 86, 20);
      panel_6.add(eventNrOfMembersText);
      eventNrOfMembersText.setColumns(10);

      eventLengthText = new JTextField();
      eventLengthText.setBounds(407, 90, 86, 20);
      panel_6.add(eventLengthText);
      eventLengthText.setColumns(10);

      eventDiscountText = new JTextField();
      eventDiscountText.setBounds(539, 90, 86, 20);
      panel_6.add(eventDiscountText);
      eventDiscountText.setColumns(10);

      eventFinalizedText = new JTextField();
      eventFinalizedText.setBounds(6, 155, 86, 20);
      panel_6.add(eventFinalizedText);
      eventFinalizedText.setColumns(10);

      eventTypeOfEventText = new JTextField();
      eventTypeOfEventText.setBounds(128, 155, 86, 20);
      panel_6.add(eventTypeOfEventText);
      eventTypeOfEventText.setColumns(10);

      eventVeganFoodText = new JTextField();
      eventVeganFoodText.setBounds(264, 155, 86, 20);
      panel_6.add(eventVeganFoodText);
      eventVeganFoodText.setColumns(10);

      eventLocationText = new JTextField();
      eventLocationText.setBounds(407, 155, 86, 20);
      panel_6.add(eventLocationText);
      eventLocationText.setColumns(10);

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

      lecturerNameText = new JTextField();
      lecturerNameText.setBounds(10, 33, 86, 20);
      panel_2.add(lecturerNameText);
      lecturerNameText.setColumns(10);

      lecturerPaidForText = new JTextField();
      lecturerPaidForText.setBounds(132, 33, 86, 20);
      panel_2.add(lecturerPaidForText);
      lecturerPaidForText.setColumns(10);

      lecturerEmailAdText = new JTextField();
      lecturerEmailAdText.setBounds(268, 33, 86, 20);
      panel_2.add(lecturerEmailAdText);
      lecturerEmailAdText.setColumns(10);

      lecturerCategoryText = new JTextField();
      lecturerCategoryText.setBounds(403, 33, 86, 20);
      panel_2.add(lecturerCategoryText);
      lecturerCategoryText.setColumns(10);

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

      sponsorNameText = new JTextField();
      sponsorNameText.setBounds(10, 33, 86, 20);
      panel_5.add(sponsorNameText);
      sponsorNameText.setColumns(10);

      sponsorEmailAdText = new JTextField();
      sponsorEmailAdText.setBounds(128, 33, 86, 20);
      panel_5.add(sponsorEmailAdText);
      sponsorEmailAdText.setColumns(10);

      sponsorCategoryText = new JTextField();
      sponsorCategoryText.setBounds(260, 33, 86, 20);
      panel_5.add(sponsorCategoryText);
      sponsorCategoryText.setColumns(10);

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

      JTextArea feedbackTextArea = new JTextArea();
      feedbackTextArea.setWrapStyleWord(true);
      feedbackTextArea.setLineWrap(true);
      feedbackTextArea.setColumns(1);
      feedbackTextArea.setBounds(6, 16, 248, 49);
      panel_9.add(feedbackTextArea);

      JButton btnSubmit = new JButton("Submit");
      btnSubmit.setBounds(463, 389, 89, 23);
      panel_6.add(btnSubmit);

      panel_14 = new JPanel();
      panel_14.setBorder(new TitledBorder(null, "Starting Day", TitledBorder.LEADING, TitledBorder.TOP, null, null));
      panel_14.setBounds(635, 55, 202, 111);
      panel_6.add(panel_14);
      panel_14.setLayout(null);

      dayText = new JTextField();
      dayText.setBounds(10, 35, 86, 20);
      panel_14.add(dayText);
      dayText.setColumns(10);

      monthText = new JTextField();
      monthText.setBounds(106, 35, 86, 20);
      panel_14.add(monthText);
      monthText.setColumns(10);

      yearText = new JTextField();
      yearText.setBounds(10, 80, 86, 20);
      panel_14.add(yearText);
      yearText.setColumns(10);

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

      // MEMBERS

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
      btnCreateMember.setBounds(349, 283, 132, 23);
      panel_7.add(btnCreateMember);

      panel_16 = new JPanel();
      panel_16.setBorder(new TitledBorder(null, "Manage Member", TitledBorder.LEADING, TitledBorder.TOP, null, null));
      panel_16.setBounds(231, 56, 387, 198);
      panel_7.add(panel_16);
      panel_16.setLayout(null);

      memberNameText = new JTextField();
      memberNameText.setBounds(10, 37, 86, 20);
      panel_16.add(memberNameText);
      memberNameText.setColumns(10);

      memberEmailText = new JTextField();
      memberEmailText.setBounds(132, 37, 86, 20);
      panel_16.add(memberEmailText);
      memberEmailText.setColumns(10);

      memberAddressText = new JTextField();
      memberAddressText.setBounds(246, 37, 86, 20);
      panel_16.add(memberAddressText);
      memberAddressText.setColumns(10);

      memberPhoneText = new JTextField();
      memberPhoneText.setBounds(10, 103, 86, 20);
      panel_16.add(memberPhoneText);
      memberPhoneText.setColumns(10);

      memberYearOfPeymentText = new JTextField();
      memberYearOfPeymentText.setBounds(132, 103, 86, 20);
      panel_16.add(memberYearOfPeymentText);
      memberYearOfPeymentText.setColumns(10);

      memberCategoryText = new JTextField();
      memberCategoryText.setBounds(246, 103, 86, 20);
      panel_16.add(memberCategoryText);
      memberCategoryText.setColumns(10);

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

      JLabel lblRegistrationDate = new JLabel("Registration Date");
      lblRegistrationDate.setBounds(132, 146, 110, 16);
      panel_16.add(lblRegistrationDate);

      memberRegistrationDateTextField = new JTextField();
      memberRegistrationDateTextField.setBounds(132, 163, 86, 22);
      panel_16.add(memberRegistrationDateTextField);
      memberRegistrationDateTextField.setColumns(10);

      memberSelectText = new JTextField();
      memberSelectText.setBounds(331, 335, 86, 20);
      panel_7.add(memberSelectText);
      memberSelectText.setColumns(10);

      JLabel lblSelectMember = new JLabel("Select member by name");
      lblSelectMember.setBounds(153, 335, 166, 20);
      panel_7.add(lblSelectMember);

      btnRemoveMember = new JButton("Remove");
      btnRemoveMember.setBounds(649, 334, 103, 23);
      panel_7.add(btnRemoveMember);

      btnSelectMember = new JButton("Select");
      btnSelectMember.setBounds(446, 333, 97, 25);
      panel_7.add(btnSelectMember);

      btnSaveMember = new JButton("Save");
      btnSaveMember.setBounds(547, 333, 97, 25);
      panel_7.add(btnSaveMember);

      JPanel panel_8 = new JPanel();
      tabbedPane_4.addTab("List Members", null, panel_8, null);
      panel_8.setLayout(null);

      btnListByEmails = new JButton("List all by Emails");

      btnListByEmails.setBounds(63, 56, 140, 23);
      panel_8.add(btnListByEmails);


      btnListByPreference = new JButton("List By Preference");
      btnListByPreference.setBounds(62, 166, 141, 23);
      panel_8.add(btnListByPreference);

      membersPreferenceText = new JTextField();
      membersPreferenceText.setText("e.g. Astrology");
      membersPreferenceText.setBounds(62, 124, 86, 20);
      panel_8.add(membersPreferenceText);
      membersPreferenceText.setColumns(10);

      lblPreference = new JLabel("Preference");
      lblPreference.setBounds(83, 106, 68, 14);
      panel_8.add(lblPreference);

      btnListIfNotPaid = new JButton("List If Not Paid");
      btnListIfNotPaid.setBounds(63, 261, 123, 23);
      panel_8.add(btnListIfNotPaid);

      lblListThoseWho = new JLabel("List Those Who Did Not Pay");
      lblListThoseWho.setBounds(58, 240, 157, 14);
      panel_8.add(lblListThoseWho);

      listsTextArea = new JTextArea();
      listsTextArea.setBackground(Color.WHITE);
      listsTextArea.setBounds(313, 61, 410, 223);
      panel_8.add(listsTextArea);
//      scrolling
      JScrollPane scrollPane = new JScrollPane(listsTextArea);
      scrollPane.setBounds(313, 56, 410, 228);
      panel_8.add(scrollPane);



   }
}