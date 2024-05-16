package org.example.Lab10.Forms.MainForm;

import org.example.Lab10.Data.CRUDMode;
import org.example.Lab10.Data.Models.*;
import org.example.Lab10.Data.Models.Timer;
import org.example.Lab10.Data.QueryBuilder;
import org.example.Lab10.Data.QueryCreationListener;

import javax.swing.*;
import java.awt.*;

public class QueryConfigurationTabbedPane extends JTabbedPane implements QueryCreationListener {
    private JPanel serviceSelectPanel;
    private JPanel roomSelectPanel;
    private JPanel usersSelectPanel;
    private JPanel statusSelectPanel;
    private JPanel roleSelectPanel;
    private JPanel timerSelectPanel;
    private JPanel messageSelectPanel;

    private JTextField textFieldLabel;
    private QueryBuilder queryBuilder;
    private CRUDMode crudMode;

    public QueryConfigurationTabbedPane(JTextField queryOutput){
        crudMode = CRUDMode.READ;
        queryBuilder = new QueryBuilder();
        textFieldLabel = queryOutput;
        initPanels();

        add("Service", serviceSelectPanel);
        add("Room", roomSelectPanel);
        add("Users", usersSelectPanel);
        add("Status", statusSelectPanel);
        add("Role", roleSelectPanel);
        add("Timer", timerSelectPanel);
        add("Message", messageSelectPanel);
    }

    private void initPanels(){
        serviceSelectPanel = createServicePanel();
        roomSelectPanel = createRoomPanel();
        usersSelectPanel = createUsersPanel();
        statusSelectPanel = createStatusPanel();
        roleSelectPanel = createRolePanel();
        timerSelectPanel = createTimerPanel();
        messageSelectPanel = createMessagePanel();
    }

    public CRUDMode getCrudMode() {
        return crudMode;
    }

    public void setCrudMode(CRUDMode crudMode) {
        this.crudMode = crudMode;
    }

    private JPanel createServicePanel() {
        JPanel servicePanel = new JPanel(new BorderLayout());

        JPanel innerPanel = new JPanel();
        servicePanel.add(innerPanel, BorderLayout.NORTH);
        JButton execButton = new JButton();
        execButton.setText("Create query");
        innerPanel.add(execButton);

        JPanel inputPanel = new JPanel();
        servicePanel.add(inputPanel, BorderLayout.CENTER);

        JLabel urlLabel = new JLabel("URL:");
        JTextField urlTF = new JTextField();
        urlTF.setPreferredSize(new Dimension(300, 30));
        inputPanel.add(urlLabel);
        inputPanel.add(urlTF);

        JComboBox<String> localizationComboBox = new JComboBox<>(new String[]{"English", "Spanish", "French"});
        inputPanel.add(localizationComboBox);

        execButton.addActionListener(e -> {
            Service service = new Service();
            service.setURL(urlTF.getText().trim());
            service.setLocalization((String) localizationComboBox.getSelectedItem());
            onQueryCreate(service);
        });

        return servicePanel;
    }

    private JPanel createRoomPanel() {
        JPanel roomPanel = new JPanel(new BorderLayout());

        JPanel innerPanel = new JPanel();
        roomPanel.add(innerPanel, BorderLayout.NORTH);
        JButton execButton = new JButton();
        execButton.setText("Create query");
        innerPanel.add(execButton);

        JPanel inputPanel = new JPanel();
        roomPanel.add(inputPanel, BorderLayout.CENTER);

        JLabel ownerLabel = new JLabel("Owner ID:");
        JTextField ownerTF = new JTextField();
        ownerTF.setPreferredSize(new Dimension(300, 30));
        inputPanel.add(ownerLabel);
        inputPanel.add(ownerTF);

        JComboBox<String> gameStageComboBox = new JComboBox<>(new String[]{"Morning", "Midday", "Evening", "Night"});
        inputPanel.add(gameStageComboBox);

        JLabel timerLabel = new JLabel("Timer ID:");
        JTextField timerTF = new JTextField();
        timerTF.setPreferredSize(new Dimension(300, 30));
        inputPanel.add(timerLabel);
        inputPanel.add(timerTF);

        JLabel chatLabel = new JLabel("Chat ID:");
        JTextField chatTF = new JTextField();
        chatTF.setPreferredSize(new Dimension(300, 30));
        inputPanel.add(chatLabel);
        inputPanel.add(chatTF);

        execButton.addActionListener(e -> {
            Room room = new Room();
            try {
                room.setOwner(Long.parseLong(ownerTF.getText().trim()));
                room.setGameStage((String) gameStageComboBox.getSelectedItem());
                room.setTimer(Long.parseLong(timerTF.getText().trim()));
                room.setChat(Long.parseLong(chatTF.getText().trim()));
                onQueryCreate(room);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter numeric values.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        return roomPanel;
    }

    private JPanel createUsersPanel() {
        JPanel usersPanel = new JPanel(new BorderLayout());

        JPanel innerPanel = new JPanel();
        usersPanel.add(innerPanel, BorderLayout.NORTH);
        JButton execButton = new JButton();
        execButton.setText("Create query");
        innerPanel.add(execButton);

        JPanel inputPanel = new JPanel();
        usersPanel.add(inputPanel, BorderLayout.CENTER);

        JLabel loginLabel = new JLabel("Login:");
        JTextField loginTF = new JTextField();
        loginTF.setPreferredSize(new Dimension(300, 30));
        inputPanel.add(loginLabel);
        inputPanel.add(loginTF);

        JLabel nameLabel = new JLabel("Name:");
        JTextField nameTF = new JTextField();
        nameTF.setPreferredSize(new Dimension(300, 30));
        inputPanel.add(nameLabel);
        inputPanel.add(nameTF);

        JLabel statusLabel = new JLabel("Status ID:");
        JTextField statusTF = new JTextField();
        statusTF.setPreferredSize(new Dimension(300, 30));
        inputPanel.add(statusLabel);
        inputPanel.add(statusTF);

        JLabel roleLabel = new JLabel("Role ID:");
        JTextField roleTF = new JTextField();
        roleTF.setPreferredSize(new Dimension(300, 30));
        inputPanel.add(roleLabel);
        inputPanel.add(roleTF);

        execButton.addActionListener(e -> {
            User user = new User();
            try {
                user.setLogin(loginTF.getText().trim());
                user.setName(nameTF.getText().trim());
                user.setStatus(Long.parseLong(statusTF.getText().trim()));
                user.setRole(Long.parseLong(roleTF.getText().trim()));
                onQueryCreate(user);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter numeric values.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        return usersPanel;
    }

    private JPanel createStatusPanel() {
        JPanel statusPanel = new JPanel(new BorderLayout());

        JPanel innerPanel = new JPanel();
        statusPanel.add(innerPanel, BorderLayout.NORTH);
        JButton execButton = new JButton();
        execButton.setText("Create query");
        innerPanel.add(execButton);

        JPanel inputPanel = new JPanel();
        statusPanel.add(inputPanel, BorderLayout.CENTER);

        JLabel aliveLabel = new JLabel("Is Alive: ");
        JCheckBox isAliveCheckBox = new JCheckBox();
        inputPanel.add(aliveLabel);
        inputPanel.add(isAliveCheckBox);

        execButton.addActionListener(e -> {
            Status status = new Status();
            status.setAlive(isAliveCheckBox.isSelected());
            onQueryCreate(status);
        });

        return statusPanel;
    }

    private JPanel createRolePanel() {
        JPanel rolePanel = new JPanel(new BorderLayout());

        JPanel innerPanel = new JPanel();
        rolePanel.add(innerPanel, BorderLayout.NORTH);
        JButton execButton = new JButton();
        execButton.setText("Create query");
        innerPanel.add(execButton);

        JPanel inputPanel = new JPanel();
        rolePanel.add(inputPanel, BorderLayout.CENTER);

        JLabel nameLabel = new JLabel("Name:");
        JTextField nameTF = new JTextField();
        nameTF.setPreferredSize(new Dimension(300, 30));
        inputPanel.add(nameLabel);
        inputPanel.add(nameTF);

        JLabel descriptionLabel = new JLabel("Description:");
        JTextField descriptionTF = new JTextField();
        descriptionTF.setPreferredSize(new Dimension(300, 30));
        inputPanel.add(descriptionLabel);
        inputPanel.add(descriptionTF);

        JLabel healthLabel = new JLabel("Health:");
        JTextField healthTF = new JTextField();
        healthTF.setPreferredSize(new Dimension(300, 30));
        inputPanel.add(healthLabel);
        inputPanel.add(healthTF);

        JLabel damageLabel = new JLabel("Damage:");
        JTextField damageTF = new JTextField();
        damageTF.setPreferredSize(new Dimension(300, 30));
        inputPanel.add(damageLabel);
        inputPanel.add(damageTF);

        JLabel winConditionLabel = new JLabel("Win Condition:");
        JTextField winConditionTF = new JTextField();
        winConditionTF.setPreferredSize(new Dimension(300, 30));
        inputPanel.add(winConditionLabel);
        inputPanel.add(winConditionTF);

        execButton.addActionListener(e -> {
            Role role = new Role();
            try {
                role.setHealth(Short.parseShort(healthTF.getText().trim()));
                role.setDamage(Short.parseShort(damageTF.getText().trim()));
                // Set other fields
                onQueryCreate(role);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter numeric values.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        return rolePanel;
    }

    private JPanel createTimerPanel() {
        JPanel timerPanel = new JPanel(new BorderLayout());

        JPanel innerPanel = new JPanel();
        timerPanel.add(innerPanel, BorderLayout.NORTH);
        JButton execButton = new JButton();
        execButton.setText("Create query");
        innerPanel.add(execButton);

        JPanel inputPanel = new JPanel();
        timerPanel.add(inputPanel, BorderLayout.CENTER);

        JLabel triggerTimeLabel = new JLabel("Trigger Time (sec):");
        JTextField triggerTimeTF = new JTextField();
        triggerTimeTF.setPreferredSize(new Dimension(300, 30));
        inputPanel.add(triggerTimeLabel);
        inputPanel.add(triggerTimeTF);

        JLabel currentTimeLabel = new JLabel("Current Time (sec):");
        JTextField currentTimeTF = new JTextField();
        currentTimeTF.setPreferredSize(new Dimension(300, 30));
        inputPanel.add(currentTimeLabel);
        inputPanel.add(currentTimeTF);

        execButton.addActionListener(e -> {
            Timer timer = new Timer();
            try {
                timer.setTriggerTime(Long.parseLong(triggerTimeTF.getText().trim()));
                timer.setCurrentTime(Long.parseLong(currentTimeTF.getText().trim()));
                onQueryCreate(timer);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter numeric values.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        return timerPanel;
    }

    private JPanel createMessagePanel() {
        JPanel messagePanel = new JPanel(new BorderLayout());

        JPanel innerPanel = new JPanel();
        messagePanel.add(innerPanel, BorderLayout.NORTH);
        JButton execButton = new JButton();
        execButton.setText("Create query");
        innerPanel.add(execButton);

        JPanel inputPanel = new JPanel();
        messagePanel.add(inputPanel, BorderLayout.CENTER);

        JLabel senderLabel = new JLabel("Sender ID:");
        JTextField senderTF = new JTextField();
        senderTF.setPreferredSize(new Dimension(300, 30));
        inputPanel.add(senderLabel);
        inputPanel.add(senderTF);

        JLabel sendTimeLabel = new JLabel("Send Time (sec):");
        JTextField sendTimeTF = new JTextField();
        sendTimeTF.setPreferredSize(new Dimension(300, 30));
        inputPanel.add(sendTimeLabel);
        inputPanel.add(sendTimeTF);

        JLabel messageTextLabel = new JLabel("Message Text:");
        JTextField messageTextTF = new JTextField();
        messageTextTF.setPreferredSize(new Dimension(300, 30));
        inputPanel.add(messageTextLabel);
        inputPanel.add(messageTextTF);

        execButton.addActionListener(e -> {
            Message message = new Message();
            try {
                message.setSender(Long.parseLong(senderTF.getText().trim()));
                message.setSendTime(Long.parseLong(sendTimeTF.getText().trim()));
                message.setMessageText(messageTextTF.getText().trim());
                onQueryCreate(message);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter numeric values.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        return messagePanel;
    }

    @Override
    public void onQueryCreate(Service service) {
        textFieldLabel.setText(queryBuilder.buildQuery(service, crudMode));
    }

    @Override
    public void onQueryCreate(Room room) {
        textFieldLabel.setText(queryBuilder.buildQuery(room, crudMode));
    }

    @Override
    public void onQueryCreate(User user) {
        textFieldLabel.setText(queryBuilder.buildQuery(user, crudMode));
    }

    @Override
    public void onQueryCreate(Chat chat) {
        textFieldLabel.setText(queryBuilder.buildQuery(chat, crudMode));
    }

    @Override
    public void onQueryCreate(ChatToMessageConnection CtM) {
        textFieldLabel.setText(queryBuilder.buildQuery(CtM, crudMode));
    }

    @Override
    public void onQueryCreate(ChatToRoleConnection CtR) {
        textFieldLabel.setText(queryBuilder.buildQuery(CtR, crudMode));
    }

    @Override
    public void onQueryCreate(Message message) {
        textFieldLabel.setText(queryBuilder.buildQuery(message, crudMode));
    }

    @Override
    public void onQueryCreate(Role role) {
        textFieldLabel.setText(queryBuilder.buildQuery(role, crudMode));
    }

    @Override
    public void onQueryCreate(RoomToUserConnection RtU) {
        textFieldLabel.setText(queryBuilder.buildQuery(RtU, crudMode));
    }

    @Override
    public void onQueryCreate(ServiceToRoomConnection StR) {
        textFieldLabel.setText(queryBuilder.buildQuery(StR, crudMode));
    }

    @Override
    public void onQueryCreate(Status status) {
        textFieldLabel.setText(queryBuilder.buildQuery(status, crudMode));
    }

    @Override
    public void onQueryCreate(Timer timer) {
        textFieldLabel.setText(queryBuilder.buildQuery(timer, crudMode));
    }
}
