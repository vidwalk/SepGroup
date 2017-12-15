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
import javax.swing.ScrollPaneConstants;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;

public class GUIJava
{

   private JFrame frmEventsAndMembers;
   private JTextField txtEventToEdit;
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
   private JButton btnRemoveMember;
   private JTextField memberRegistrationDateTextField;
   private MainController main;
   private Date date ;
   private JTextField textField;
   private JTextField textField_1;
   private JTextField textField_2;
   private JTextField textField_3;
   private JTextField textField_4;
   private JTextField textField_6;
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
   private JTextField textField_23;
   private JTextField textField_26;
   private JTextField textField_27;
   private JButton btnSearch_1;
   private JTextField textField_29;
   private JTextField textField_30;
   private JTextField textField_31;
   private JLabel lblDay;
   private JLabel lblMonth;
   private JLabel lblYear;
   private JPanel panel_14;
   private JButton btnNonFinalized;
   private JButton btnFinalized;
   private JTextArea textArea;
   public MainController controller = new MainController();
   private JPanel panel_10;
   private JPanel panel_11;
   private JTextArea textArea_1;
   private JScrollPane scrollPaneMember;
   private JCheckBox chckbxTrue;
   private JCheckBox chckbxTrue_1;
   private JCheckBox chckbxTrue_2;
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
      btnCreateEvent.addActionListener(new ActionListener()
      {


         public void actionPerformed(ActionEvent e)
         {
            if (e.getSource() == btnCreateEvent)
            {
               controller.createEvent();
               Event event = controller.eventList.getLastEvent();
               textField.setText(event.getName());
               textField_1.setText("" + event.getNrParticipants());
               textField_2.setText("" + event.getNrMembers());
               textField_3.setText(event.getLength());
               textField_4.setText("" + event.getDiscount());
               chckbxTrue.setSelected(false);
               textField_6.setText(event.getType());
               chckbxTrue_1.setSelected(false);
               textField_8.setText(event.getLocation());
               textField_29.setText("" + event.getDayStart().getDay());
               textField_30.setText("" + event.getDayStart().getMonth());
               textField_31.setText("" + event.getDayStart().getYear());
               textArea.setText(event.getFeedback());
               textField_9.setText(event.getLecturer().getName());
               chckbxTrue_2.setSelected(false);
               textField_12.setText(event.getLecturer().getEmail());
               textField_13.setText(event.getLecturer().getCategory());
               textField_14.setText(event.getSponsor().getName());
               textField_15.setText(event.getSponsor().getEmail());
               textField_16.setText(event.getSponsor().getCategory());
            }
         }
      });
      btnCreateEvent.setBounds(43, 32, 109, 23);
      panel_3.add(btnCreateEvent);

      panel_6 = new JPanel();
      panel_6.setBorder(new TitledBorder(
            UIManager.getBorder("TitledBorder.border"), "Edit Event",
            TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
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

      textField_6 = new JTextField();
      textField_6.setBounds(128, 155, 86, 20);
      panel_6.add(textField_6);
      textField_6.setColumns(10);

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
      panel_2.setBorder(new TitledBorder(
            UIManager.getBorder("TitledBorder.border"), "Lecturer",
            TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
      panel_2.setLayout(null);

      textField_9 = new JTextField();
      textField_9.setBounds(10, 33, 86, 20);
      panel_2.add(textField_9);
      textField_9.setColumns(10);

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

      chckbxTrue_2 = new JCheckBox("Yes");
      chckbxTrue_2.setBounds(153, 32, 97, 23);
      chckbxTrue_2.setSelected(false);
      panel_2.add(chckbxTrue_2);

      panel_5 = new JPanel();
      panel_5.setBounds(6, 352, 356, 64);
      panel_6.add(panel_5);
      panel_5.setBorder(new TitledBorder(
            UIManager.getBorder("TitledBorder.border"), "Sponsor",
            TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
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
      panel_9.setBorder(new TitledBorder(
            UIManager.getBorder("TitledBorder.border"), "Feedback",
            TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
      panel_9.setBounds(10, 202, 260, 72);
      panel_6.add(panel_9);
      panel_9.setLayout(null);

      textArea = new JTextArea();
      textArea.setWrapStyleWord(true);
      textArea.setLineWrap(true);
      textArea.setColumns(1);
      textArea.setBounds(6, 16, 248, 49);
      panel_9.add(textArea);

      JButton btnSubmit = new JButton("Submit");
      btnSubmit.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            if (e.getSource() == btnSubmit)
            {

               controller.modifyEvent(
                     controller.searchEvent(txtEventToEdit.getText()),
                     textField.getText(), textField_1.getText(),
                     textField_29.getText(), textField_30.getText(),
                     textField_31.getText(), textField_2.getText(),
                     textField_3.getText(), textField_4.getText(),
                     chckbxTrue.isSelected(), textField_6.getText(),
                     chckbxTrue_1.isSelected(), textField_8.getText(),
                     textArea.getText(), textField_9.getText(),
                     textField_12.getText(), chckbxTrue_2.isSelected(),
                     textField_13.getText(), textField_14.getText(),
                     textField_15.getText(), textField_16.getText());
            }
         }
      });
      btnSubmit.setBounds(463, 389, 89, 23);
      panel_6.add(btnSubmit);

      panel_14 = new JPanel();
      panel_14.setBorder(new TitledBorder(null, "Starting Day",
            TitledBorder.LEADING, TitledBorder.TOP, null, null));
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
      btnRemove.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            if (e.getSource() == btnRemove)
            {
               boolean ok = true;
               try
               {
                  controller.removeEvent(txtEventToEdit.getText());
               }
               catch (NullPointerException e1)
               {
                  textField.setText("no events");
                  ok = false;
               }
               if (ok)
               {
                  textField.setText("removed");
                  textField_1.setText("");
                  textField_2.setText("");
                  textField_3.setText("");
                  textField_4.setText("");
                  chckbxTrue.setSelected(false);
                  textField_6.setText("");
                  chckbxTrue_1.setSelected(false);
                  textField_8.setText("");
                  textField_29.setText("");
                  textField_30.setText("");
                  textField_31.setText("");
                  textArea.setText("");
                  textField_9.setText("");
                  chckbxTrue_2.setSelected(false);
                  textField_12.setText("");
                  textField_13.setText("");
                  textField_14.setText("");
                  textField_15.setText("");
                  textField_16.setText("");
               }
            }
         }
      });
      btnRemove.setBounds(580, 389, 89, 23);
      panel_6.add(btnRemove);
      // Search Button with the actionListener that sets all the text fields to
      // the info present in the event
      JButton btnSearch_2 = new JButton("Search");
      btnSearch_2.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            if (e.getSource() == btnSearch_2)
            {
               Event event = controller.searchEvent(txtEventToEdit.getText());
               textField.setText(event.getName());
               // if an event is found then you input the field, if no event
               // found it clears the fields
               if (!(event.getName().equals("no event found")))
               {
                  textField_1.setText("" + event.getNrParticipants());
                  textField_2.setText("" + event.getNrMembers());
                  textField_3.setText(event.getLength());
                  textField_4.setText("" + event.getDiscount());
                  chckbxTrue.setSelected(event.isFinalized());
                  textField_6.setText(event.getType());
                  chckbxTrue_1.setSelected(event.isVegan());
                  textField_8.setText(event.getLocation());
                  textField_29.setText("" + event.getDayStart().getDay());
                  textField_30.setText("" + event.getDayStart().getMonth());
                  textField_31.setText("" + event.getDayStart().getYear());
                  textArea.setText(event.getFeedback());
                  textField_9.setText(event.getLecturer().getName());
                  chckbxTrue_2.setSelected(event.getLecturer().isPaidFor());
                  textField_12.setText(event.getLecturer().getEmail());
                  textField_13.setText(event.getLecturer().getCategory());
                  textField_14.setText(event.getSponsor().getName());
                  textField_15.setText(event.getSponsor().getEmail());
                  textField_16.setText(event.getSponsor().getCategory());
               }
               else
               {
                  textField_1.setText("");
                  textField_2.setText("");
                  textField_3.setText("");
                  textField_4.setText("");
                  chckbxTrue.setSelected(false);
                  textField_6.setText("");
                  chckbxTrue_1.setSelected(false);
                  textField_8.setText("");
                  textField_29.setText("");
                  textField_30.setText("");
                  textField_31.setText("");
                  textArea.setText("");
                  textField_9.setText("");
                  chckbxTrue_2.setSelected(false);
                  textField_12.setText("");
                  textField_13.setText("");
                  textField_14.setText("");
                  textField_15.setText("");
                  textField_16.setText("");
               }
            }
         }
      });
      btnSearch_2.setBounds(159, 29, 89, 23);
      panel_6.add(btnSearch_2);

      chckbxTrue = new JCheckBox("Yes");
      chckbxTrue.setBounds(25, 154, 97, 23);
      chckbxTrue.setSelected(false);
      panel_6.add(chckbxTrue);

      chckbxTrue_1 = new JCheckBox("Yes");
      chckbxTrue_1.setBounds(279, 154, 97, 23);
      chckbxTrue_1.setSelected(false);
      panel_6.add(chckbxTrue_1);

      JPanel panel_4 = new JPanel();
      tabbedPane_1.addTab("Search/List", null, panel_4, null);
      panel_4.setLayout(null);

      panel_10 = new JPanel();
      panel_10.setBorder(new TitledBorder(null, "Events", TitledBorder.LEADING,
            TitledBorder.TOP, null, null));
      panel_10.setBounds(20, 25, 508, 99);
      panel_4.add(panel_10);
      panel_10.setLayout(null);

      textField_23 = new JTextField();
      textField_23.setBounds(148, 38, 86, 20);
      panel_10.add(textField_23);
      textField_23.setColumns(10);

      JLabel lblNewLabel_8 = new JLabel("Category");
      lblNewLabel_8.setBounds(166, 23, 68, 14);
      panel_10.add(lblNewLabel_8);
      // Show all the events in a pane
      btnSearch_1 = new JButton("Show Events");
      btnSearch_1.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent arg0)
         {
            if (arg0.getSource() == btnSearch_1)
            {
               // controller.eventList.toString();

               textArea_1.setText(controller.eventList.toString());
            }
         }
      });
      btnSearch_1.setBounds(10, 69, 113, 23);
      panel_10.add(btnSearch_1);

      btnNonFinalized = new JButton("Non Finalized");
      btnNonFinalized.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            if (e.getSource() == btnNonFinalized)
            {
               textArea_1.setText(controller.eventList.searchByNotFinalized());
            }
         }
      });
      btnNonFinalized.setBounds(253, 69, 122, 23);
      panel_10.add(btnNonFinalized);

      btnFinalized = new JButton("Finalized");
      btnFinalized.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            if (e.getSource() == btnFinalized)
            {
               textArea_1.setText(controller.eventList.searchByFinalized());
            }

         }
      });
      btnFinalized.setBounds(385, 69, 113, 23);
      panel_10.add(btnFinalized);

      JButton btnSearch = new JButton("Search");
      btnSearch.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            if (e.getSource() == btnSearch)
            {
               textArea_1.setText(controller.eventList
                     .searchByCategoryEvent(textField_23.getText()));
            }
         }
      });
      btnSearch.setBounds(145, 69, 89, 23);
      panel_10.add(btnSearch);

      panel_11 = new JPanel();
      panel_11.setBorder(new TitledBorder(null, "Lecturers/Sponsors",
            TitledBorder.LEADING, TitledBorder.TOP, null, null));
      panel_11.setBounds(549, 25, 315, 97);
      panel_4.add(panel_11);
      panel_11.setLayout(null);

      textField_26 = new JTextField();
      textField_26.setBounds(10, 38, 86, 20);
      panel_11.add(textField_26);
      textField_26.setColumns(10);

      JButton btnList = new JButton("List");
      btnList.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {

            controller.eventList.listByCategoryLecturer(textField_26.getText());

            controller.eventList.listByCategorySponsor(textField_27.getText());

         }
      });
      btnList.setBounds(10, 66, 89, 23);
      panel_11.add(btnList);

      textField_27 = new JTextField();
      textField_27.setBounds(185, 38, 86, 20);
      panel_11.add(textField_27);
      textField_27.setColumns(10);

      JLabel lblCategoryOfLecturers = new JLabel("Category of Lecturers");
      lblCategoryOfLecturers.setBounds(10, 25, 140, 14);
      panel_11.add(lblCategoryOfLecturers);

      JLabel lblCategoryOfSponsors = new JLabel("Category of Sponsors");
      lblCategoryOfSponsors.setBounds(185, 25, 140, 14);
      panel_11.add(lblCategoryOfSponsors);

      JScrollPane scrollPane = new JScrollPane();
      scrollPane.setHorizontalScrollBarPolicy(
            ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
      scrollPane.setVerticalScrollBarPolicy(
            ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
      scrollPane.setBounds(10, 140, 876, 374);
      panel_4.add(scrollPane);

      textArea_1 = new JTextArea();
      scrollPane.setViewportView(textArea_1);


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

      btnListByEmails = new JButton("List all Emails");

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

      scrollPaneMember = new JScrollPane(listsTextArea);
      scrollPaneMember.setBounds(313, 56, 410, 228);
      panel_8.add(scrollPaneMember);


   }
}