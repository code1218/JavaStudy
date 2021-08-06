package chapters11;

import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import javax.swing.ListSelectionModel;

public class Emp extends JFrame {

	private JPanel mainPanel;
	private JTextField idField;
	private JPasswordField pwdField;
	private JTextField joinIdField;
	private JTextField joinNameField;
	private JTextField joinPhoneField;
	private JPasswordField joinPwdField;
	private JPasswordField joinRePwdField;
	private JLabel welcomMessage;
	
	private boolean joinIdCheckFlag = false;
	private UserBean loginUserBean = null;
	private JPasswordField updatePwdText;
	private JPasswordField updateRePwdText;
	private JTextField updateNameText;
	private JTextField updatePhoneText;
	
	//userInfoLabel
	private JLabel userInfoId;
	private JLabel userInfoName;
	private JLabel userInfoPhone;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Emp frame = new Emp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Emp() {
		ArrayList<UserBean> userList = new ArrayList<UserBean>();
		
		CardLayout mainCard = new CardLayout();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 989, 522);
		mainPanel = new JPanel();
		mainPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(mainPanel);
		mainPanel.setLayout(mainCard);
		
		JPanel mainView = new JPanel();
		mainPanel.add(mainView, "name_20595610598400");
		mainView.setLayout(null);
		
		JLabel mainTitleLabel = new JLabel("\uC0AC\uC6D0\uAD00\uB9AC \uD504\uB85C\uADF8\uB7A8");
		mainTitleLabel.setFont(new Font("굴림", Font.BOLD, 30));
		mainTitleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		mainTitleLabel.setBounds(296, 74, 373, 62);
		mainView.add(mainTitleLabel);
		
		JButton mainStartButton = new JButton("\uD504\uB85C\uADF8\uB7A8 \uC2DC\uC791");
		mainStartButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mainCard.show(mainPanel, "name_20615607195200");
			}
		});
		mainStartButton.setBounds(372, 250, 219, 47);
		mainView.add(mainStartButton);
		
		JPanel loginView = new JPanel();
		mainPanel.add(loginView, "name_20615607195200");
		loginView.setLayout(null);
		
		JLabel idLabel = new JLabel("\uC544\uC774\uB514");
		idLabel.setBounds(248, 180, 57, 15);
		loginView.add(idLabel);
		
		JLabel pwdLabel = new JLabel("\uBE44\uBC00\uBC88\uD638");
		pwdLabel.setBounds(248, 235, 57, 15);
		loginView.add(pwdLabel);
		
		idField = new JTextField();
		idField.setBounds(317, 171, 277, 33);
		loginView.add(idField);
		idField.setColumns(10);
		
		pwdField = new JPasswordField();
		pwdField.setBounds(317, 226, 277, 33);
		loginView.add(pwdField);
		
		JLabel loginTitle = new JLabel("\uB85C\uADF8\uC778 \uD398\uC774\uC9C0");
		loginTitle.setFont(new Font("굴림", Font.BOLD, 30));
		loginTitle.setHorizontalAlignment(SwingConstants.CENTER);
		loginTitle.setBounds(365, 73, 229, 33);
		loginView.add(loginTitle);
		
		JButton loginButton = new JButton("\uB85C\uADF8\uC778");
		loginButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String idText = idField.getText();
				String pwdText = pwdField.getText();
				
				UserMgrPool userMgrPool = new UserMgrPool();
				if(userMgrPool.loginCheck(idText, pwdText)) {
					loginUserBean = userMgrPool.getUserBean(idText, pwdText);
					welcomMessage.setText(loginUserBean.getUser_name() + "님 환영합니다.");
					mainCard.show(mainPanel, "name_20618782754200");
					return;
				}
				JOptionPane.showMessageDialog(null, "사용자 계정 정보가 잘 못 되었습니다.", "경고", JOptionPane.PLAIN_MESSAGE);
			}
		});
		loginButton.setBounds(617, 171, 97, 88);
		loginView.add(loginButton);
		
		JButton joinButton = new JButton("\uD68C\uC6D0\uAC00\uC785");
		joinButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mainCard.show(mainPanel, "name_20621601462100");
			}
		});
		joinButton.setBounds(432, 329, 97, 23);
		loginView.add(joinButton);
		
		JPanel homeView = new JPanel();
		mainPanel.add(homeView, "name_20618782754200");
		homeView.setLayout(null);
		
		JButton logoutButton = new JButton("\uB85C\uADF8\uC544\uC6C3");
		logoutButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				idField.setText("");
				pwdField.setText("");
				loginUserBean = null;
				mainCard.show(mainPanel, "name_20595610598400");
			}
		});
		logoutButton.setBounds(836, 427, 97, 23);
		homeView.add(logoutButton);
		
		welcomMessage = new JLabel("New label");
		welcomMessage.setBounds(12, 10, 284, 15);
		homeView.add(welcomMessage);
		
		JButton userInfoButton = new JButton("\uB9C8\uC774\uD398\uC774\uC9C0");
		userInfoButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				userInfoId.setText(loginUserBean.getUser_id());
				userInfoName.setText(loginUserBean.getUser_name());
				userInfoPhone.setText(loginUserBean.getUser_phone());
				mainCard.show(mainPanel, "name_12736128941400");
			}
		});
		userInfoButton.setBounds(803, 10, 130, 23);
		homeView.add(userInfoButton);
		
		DefaultListModel<String> model = new DefaultListModel<String>();
		model.add(0, "김준일");
		
		
		
		JPanel joinView = new JPanel();
		mainPanel.add(joinView, "name_20621601462100");
		joinView.setLayout(null);
		
		joinIdField = new JTextField();
		joinIdField.setBounds(399, 112, 153, 30);
		joinView.add(joinIdField);
		joinIdField.setColumns(10);
		
		joinNameField = new JTextField();
		joinNameField.setColumns(10);
		joinNameField.setBounds(399, 275, 239, 30);
		joinView.add(joinNameField);
		
		joinPhoneField = new JTextField();
		joinPhoneField.setColumns(10);
		joinPhoneField.setBounds(399, 329, 239, 30);
		joinView.add(joinPhoneField);
		
		joinPwdField = new JPasswordField();
		joinPwdField.setBounds(399, 162, 239, 30);
		joinView.add(joinPwdField);
		
		joinRePwdField = new JPasswordField();
		joinRePwdField.setBounds(399, 216, 239, 30);
		joinView.add(joinRePwdField);
		
		JLabel joinIdLabel = new JLabel("\uC544\uC774\uB514");
		joinIdLabel.setBounds(313, 119, 57, 15);
		joinView.add(joinIdLabel);
		
		JLabel joinPwdLabel = new JLabel("\uBE44\uBC00\uBC88\uD638");
		joinPwdLabel.setBounds(313, 169, 57, 15);
		joinView.add(joinPwdLabel);
		
		JLabel joinRePwdLabel = new JLabel("\uBE44\uBC00\uBC88\uD638 \uD655\uC778");
		joinRePwdLabel.setBounds(313, 223, 84, 15);
		joinView.add(joinRePwdLabel);
		
		JLabel joinNameLabel = new JLabel("\uC774\uB984");
		joinNameLabel.setBounds(313, 282, 57, 15);
		joinView.add(joinNameLabel);
		
		JLabel joinPhoneLabel = new JLabel("\uC5F0\uB77D\uCC98");
		joinPhoneLabel.setBounds(313, 336, 57, 15);
		joinView.add(joinPhoneLabel);
		
		JLabel joinTitle = new JLabel("\uD68C\uC6D0\uAC00\uC785");
		joinTitle.setHorizontalAlignment(SwingConstants.CENTER);
		joinTitle.setFont(new Font("굴림", Font.BOLD, 30));
		joinTitle.setBounds(385, 22, 200, 42);
		joinView.add(joinTitle);
		
		JButton idCheckButton = new JButton("\uC911\uBCF5\uD655\uC778");
		idCheckButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String joinIdText = joinIdField.getText();
				JoinMgrPool joinMgrPool = new JoinMgrPool();
				
				if(joinIdText.length() != 0) {
					if(joinMgrPool.idCheck(joinIdText)) {
						JOptionPane.showMessageDialog(null, "가입할 수 없는 아이디입니다.", "경고", JOptionPane.WARNING_MESSAGE);
						return;
					}
					JOptionPane.showMessageDialog(null, joinIdText + "는 사용 가능한 아이디입니다.", "확인", JOptionPane.INFORMATION_MESSAGE);
					joinIdCheckFlag = true;
				}else {
					JOptionPane.showMessageDialog(null, "공백은 입력할 수 없습니다.", "경고", JOptionPane.WARNING_MESSAGE);
				}
				
			}
		});
		idCheckButton.setBounds(554, 112, 84, 30);
		joinView.add(idCheckButton);
		
		JButton joinSubmitButton = new JButton("\uAC00\uC785\uD558\uAE30");
		joinSubmitButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String joinIdText = joinIdField.getText();
				String joinPwdText = joinPwdField.getText();
				String joinRePwdText = joinRePwdField.getText();
				String joinNameText = joinNameField.getText();
				String joinPhoneText = joinPhoneField.getText();
				if(joinIdCheckFlag == false) {
					JOptionPane.showMessageDialog(null, "아이디 중복확인이 되지 않았습니다.", "경고", JOptionPane.WARNING_MESSAGE);
				}else if(joinPwdText.length() == 0) {
					JOptionPane.showMessageDialog(null, "비밀번호는 공백일 수 없습니다.", "경고", JOptionPane.WARNING_MESSAGE);
				}else if(joinRePwdText.length() == 0) {
					JOptionPane.showMessageDialog(null, "비밀번호 확인은 공백일 수 없습니다.", "경고", JOptionPane.WARNING_MESSAGE);
				}else if(joinNameText.length() == 0) {
					JOptionPane.showMessageDialog(null, "이름은 공백일 수 없습니다.", "경고", JOptionPane.WARNING_MESSAGE);
				}else if(joinPhoneText.length() == 0) {
					JOptionPane.showMessageDialog(null, "연락처는 공백일 수 없습니다.", "경고", JOptionPane.WARNING_MESSAGE);
				}else if(!joinPwdText.equals(joinRePwdText)){
					JOptionPane.showMessageDialog(null, "비밀번호가 일치하지 않습니다.", "경고", JOptionPane.WARNING_MESSAGE);
				}else {
					UserBean userBean = new UserBean();
					userBean.setUser_id(joinIdText);
					userBean.setUser_pwd(joinRePwdText);
					userBean.setUser_name(joinNameText);
					userBean.setUser_phone(joinPhoneText);
					JoinMgrPool joinMgrPool = new JoinMgrPool();
					if(joinMgrPool.joinSubmit(userBean)) {
						joinIdField.setText("");
						joinPwdField.setText("");
						joinRePwdField.setText("");
						joinNameField.setText("");
						joinPhoneField.setText("");
						joinIdCheckFlag = false;
						JOptionPane.showMessageDialog(null, "축하합니다.\n회원가입에 성공하였습니다.", "회원가입 성공", JOptionPane.INFORMATION_MESSAGE);
						mainCard.show(mainPanel, "name_20615607195200");
					}else {
						JOptionPane.showMessageDialog(null, "DataBase에 정보를 추가하는 중에 오류가 발생하였습니다.", "DB_Exeption", JOptionPane.ERROR_MESSAGE);
					}
				}
				
			}
		});
		joinSubmitButton.setBounds(313, 383, 325, 42);
		joinView.add(joinSubmitButton);
		
		JPanel userInfo = new JPanel();
		mainPanel.add(userInfo, "name_12736128941400");
		userInfo.setLayout(null);
		
		JLabel updatePwdLabel = new JLabel("\uBE44\uBC00\uBC88\uD638");
		updatePwdLabel.setBounds(551, 124, 57, 15);
		userInfo.add(updatePwdLabel);
		
		JLabel updateRePwdLabel = new JLabel("\uBE44\uBC00\uBC88\uD638 \uD655\uC778");
		updateRePwdLabel.setBounds(551, 178, 84, 15);
		userInfo.add(updateRePwdLabel);
		
		JLabel updateNameLabel = new JLabel("\uC774\uB984");
		updateNameLabel.setBounds(551, 237, 57, 15);
		userInfo.add(updateNameLabel);
		
		JLabel updatePhoneLabel = new JLabel("\uC5F0\uB77D\uCC98");
		updatePhoneLabel.setBounds(551, 291, 57, 15);
		userInfo.add(updatePhoneLabel);
		
		updatePwdText = new JPasswordField();
		updatePwdText.setBounds(637, 117, 239, 30);
		userInfo.add(updatePwdText);
		
		updateRePwdText = new JPasswordField();
		updateRePwdText.setBounds(637, 171, 239, 30);
		userInfo.add(updateRePwdText);
		
		updateNameText = new JTextField();
		updateNameText.setColumns(10);
		updateNameText.setBounds(637, 230, 239, 30);
		userInfo.add(updateNameText);
		
		updatePhoneText = new JTextField();
		updatePhoneText.setColumns(10);
		updatePhoneText.setBounds(637, 284, 239, 30);
		userInfo.add(updatePhoneText);
		
		JLabel updateUserTitle = new JLabel("\uD68C\uC6D0\uC815\uBCF4\uC218\uC815");
		updateUserTitle.setFont(new Font("굴림", Font.BOLD, 20));
		updateUserTitle.setHorizontalAlignment(SwingConstants.CENTER);
		updateUserTitle.setBounds(623, 49, 190, 30);
		userInfo.add(updateUserTitle);
		
		JLabel UserInfoTitle = new JLabel("\uD68C\uC6D0\uC815\uBCF4");
		UserInfoTitle.setHorizontalAlignment(SwingConstants.CENTER);
		UserInfoTitle.setFont(new Font("굴림", Font.BOLD, 20));
		UserInfoTitle.setBounds(145, 49, 190, 30);
		userInfo.add(UserInfoTitle);
		
		JLabel userInfoIdLabel = new JLabel("\uC544\uC774\uB514");
		userInfoIdLabel.setBounds(135, 124, 57, 15);
		userInfo.add(userInfoIdLabel);
		
		JLabel userInfoNameLabel = new JLabel("\uC774\uB984");
		userInfoNameLabel.setBounds(135, 168, 57, 15);
		userInfo.add(userInfoNameLabel);
		
		JLabel userInfoPhoneLabel = new JLabel("\uC5F0\uB77D\uCC98");
		userInfoPhoneLabel.setBounds(135, 213, 57, 15);
		userInfo.add(userInfoPhoneLabel);
		
		userInfoId = new JLabel("New label");
		userInfoId.setBounds(204, 124, 57, 15);
		userInfo.add(userInfoId);
		
		userInfoName = new JLabel("New label");
		userInfoName.setBounds(204, 168, 57, 15);
		userInfo.add(userInfoName);
		
		userInfoPhone = new JLabel("New label");
		userInfoPhone.setBounds(204, 213, 131, 15);
		userInfo.add(userInfoPhone);
		
		JButton updateSubmitButton = new JButton("\uC218\uC815\uD558\uAE30");
		updateSubmitButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String pwd = updatePwdText.getText();
				String rePwd = updateRePwdText.getText();
				String name = updateNameText.getText();
				String phone = updatePhoneText.getText();
				
				if(pwd.length() == 0 && rePwd.length() == 0 
						&& name.length() == 0 && phone.length() == 0) {
					JOptionPane.showMessageDialog(null, "수정할 내용이 없습니다.", "수정오류", JOptionPane.INFORMATION_MESSAGE);
				}else if(pwd.length() != 0 && rePwd.length() != 0) {
					JOptionPane.showMessageDialog(null, "수정할 비밀번호가 일치하지 않습니다.", "수정오류", JOptionPane.ERROR_MESSAGE);
				}else {
					
				}
				
			}
		});
		updateSubmitButton.setBounds(551, 350, 325, 38);
		userInfo.add(updateSubmitButton);
		
		JButton deleteSubmitButton = new JButton("\uD68C\uC6D0\uD0C8\uD1F4");
		deleteSubmitButton.setBounds(88, 350, 325, 38);
		userInfo.add(deleteSubmitButton);
		
		JButton userInfoHomeButton = new JButton("\uBA54\uC778\uD654\uBA74");
		userInfoHomeButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mainCard.show(mainPanel, "name_20618782754200");
			}
		});
		userInfoHomeButton.setBounds(854, 440, 97, 23);
		userInfo.add(userInfoHomeButton);
	}
}
