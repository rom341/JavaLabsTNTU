package org.example.Lab10.Forms.MainForm;

import javax.swing.*;
import java.awt.*;

public class QueryConfigurationTabbedPane extends JTabbedPane {
    private JPanel serviceSelectPanel;
    private JPanel roomSelectPanel;
    private JPanel usersSelectPanel;
    private JPanel statusSelectPanel;
    private JPanel roleSelectPanel;
    private JPanel timerSelectPanel;
    private JPanel chatSelectPanel;
    private JPanel messageSelectPanel;

    public QueryConfigurationTabbedPane(){
        initPanels();

        add("Service", serviceSelectPanel);
        add("Room", roomSelectPanel);
        add("Users", usersSelectPanel);
        add("Status", statusSelectPanel);
        add("Role", roleSelectPanel);
        add("Timer", timerSelectPanel);
        add("Chat", chatSelectPanel);
        add("Message", messageSelectPanel);
    }
    private void initPanels(){
        serviceSelectPanel = createSelectorServicePanel();
        roomSelectPanel = createSelectorRoomPanel();
        usersSelectPanel = createSelectorUsersPanel();
        statusSelectPanel = createSelectorStatusPanel();
        roleSelectPanel = createSelectorRolePanel();
        timerSelectPanel = createSelectorTimerPanel();
        chatSelectPanel = createSelectorChatPanel();
        messageSelectPanel = createSelectorMessagePanel();
    }
    private JPanel createSelectorServicePanel() {
        JPanel servicePanel = new JPanel(new BorderLayout());

        JPanel innerPanel = new JPanel();
        servicePanel.add(innerPanel, BorderLayout.NORTH);
        JButton execButton = new JButton();
        execButton.setText("Create query");
        innerPanel.add(execButton);

        JTextField textFieldLabel = new JTextField();
        textFieldLabel.setPreferredSize(new Dimension(850, 30));
        textFieldLabel.setEditable(false);
        innerPanel.add(textFieldLabel);

        JPanel inputPanel = new JPanel();
        servicePanel.add(inputPanel, BorderLayout.CENTER);

        JLabel urlLabel = new JLabel("URL:");
        JTextField urlTF = new JTextField();
        urlTF.setPreferredSize(new Dimension(300, 30));
        inputPanel.add(urlLabel);
        inputPanel.add(urlTF);

        JLabel localLabel = new JLabel("Localization:");
        JTextField localTF = new JTextField();
        localTF.setPreferredSize(new Dimension(300, 30));
        inputPanel.add(localLabel);
        inputPanel.add(localTF);

        return servicePanel;
    }

    private JPanel createSelectorRoomPanel() {
        JPanel roomPanel = new JPanel(new BorderLayout());

        JPanel innerPanel = new JPanel();
        roomPanel.add(innerPanel, BorderLayout.NORTH);
        JButton execButton = new JButton();
        execButton.setText("Create query");
        innerPanel.add(execButton);

        JTextField textFieldLabel = new JTextField();
        textFieldLabel.setPreferredSize(new Dimension(850, 30));
        textFieldLabel.setEditable(false);
        innerPanel.add(textFieldLabel);

        JPanel inputPanel = new JPanel();
        roomPanel.add(inputPanel, BorderLayout.CENTER);

        JLabel ownerLabel = new JLabel("Owner:");
        JTextField ownerTF = new JTextField();
        ownerTF.setPreferredSize(new Dimension(300, 30));
        inputPanel.add(ownerLabel);
        inputPanel.add(ownerTF);

        JLabel gameStageLabel = new JLabel("Game Stage:");
        JTextField gameStageTF = new JTextField();
        gameStageTF.setPreferredSize(new Dimension(300, 30));
        inputPanel.add(gameStageLabel);
        inputPanel.add(gameStageTF);

        JLabel timerLabel = new JLabel("Timer:");
        JTextField timerTF = new JTextField();
        timerTF.setPreferredSize(new Dimension(300, 30));
        inputPanel.add(timerLabel);
        inputPanel.add(timerTF);

        JLabel chatLabel = new JLabel("Chat:");
        JTextField chatTF = new JTextField();
        chatTF.setPreferredSize(new Dimension(300, 30));
        inputPanel.add(chatLabel);
        inputPanel.add(chatTF);

        return roomPanel;
    }

    private JPanel createSelectorUsersPanel() {
        JPanel usersPanel = new JPanel(new BorderLayout());

        JPanel innerPanel = new JPanel();
        usersPanel.add(innerPanel, BorderLayout.NORTH);
        JButton execButton = new JButton();
        execButton.setText("Create query");
        innerPanel.add(execButton);

        JTextField textFieldLabel = new JTextField();
        textFieldLabel.setPreferredSize(new Dimension(850, 30));
        textFieldLabel.setEditable(false);
        innerPanel.add(textFieldLabel);

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

        JLabel statusLabel = new JLabel("Status:");
        JTextField statusTF = new JTextField();
        statusTF.setPreferredSize(new Dimension(300, 30));
        inputPanel.add(statusLabel);
        inputPanel.add(statusTF);

        JLabel roleLabel = new JLabel("Role:");
        JTextField roleTF = new JTextField();
        roleTF.setPreferredSize(new Dimension(300, 30));
        inputPanel.add(roleLabel);
        inputPanel.add(roleTF);

        return usersPanel;
    }

    private JPanel createSelectorStatusPanel() {
        JPanel statusPanel = new JPanel(new BorderLayout());

        JPanel innerPanel = new JPanel();
        statusPanel.add(innerPanel, BorderLayout.NORTH);
        JButton execButton = new JButton();
        execButton.setText("Create query");
        innerPanel.add(execButton);

        JTextField textFieldLabel = new JTextField("");
        textFieldLabel.setPreferredSize(new Dimension(850, 30));
        textFieldLabel.setEditable(false);
        innerPanel.add(textFieldLabel);

        JPanel inputPanel = new JPanel();
        statusPanel.add(inputPanel, BorderLayout.CENTER);

        JLabel isAliveLabel = new JLabel("Is Alive:");
        JTextField isAliveTF = new JTextField();
        isAliveTF.setPreferredSize(new Dimension(300, 30));
        inputPanel.add(isAliveLabel);
        inputPanel.add(isAliveTF);

        return statusPanel;
    }

    private JPanel createSelectorRolePanel() {
        JPanel rolePanel = new JPanel(new BorderLayout());

        JPanel innerPanel = new JPanel();
        rolePanel.add(innerPanel, BorderLayout.NORTH);
        JButton execButton = new JButton();
        execButton.setText("Create query");
        innerPanel.add(execButton);

        JTextField textFieldLabel = new JTextField("");
        textFieldLabel.setPreferredSize(new Dimension(850, 30));
        textFieldLabel.setEditable(false);
        innerPanel.add(textFieldLabel);

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

        return rolePanel;
    }

    private JPanel createSelectorTimerPanel() {
        JPanel timerPanel = new JPanel(new BorderLayout());

        JPanel innerPanel = new JPanel();
        timerPanel.add(innerPanel, BorderLayout.NORTH);
        JButton execButton = new JButton();
        execButton.setText("Create query");
        innerPanel.add(execButton);

        JTextField textFieldLabel = new JTextField("");
        textFieldLabel.setPreferredSize(new Dimension(850, 30));
        textFieldLabel.setEditable(false);
        innerPanel.add(textFieldLabel);

        JPanel inputPanel = new JPanel();
        timerPanel.add(inputPanel, BorderLayout.CENTER);

        JLabel triggerTimeLabel = new JLabel("Trigger Time:");
        JTextField triggerTimeTF = new JTextField();
        triggerTimeTF.setPreferredSize(new Dimension(300, 30));
        inputPanel.add(triggerTimeLabel);
        inputPanel.add(triggerTimeTF);

        JLabel currentTimeLabel = new JLabel("Current Time:");
        JTextField currentTimeTF = new JTextField();
        currentTimeTF.setPreferredSize(new Dimension(300, 30));
        inputPanel.add(currentTimeLabel);
        inputPanel.add(currentTimeTF);

        return timerPanel;
    }

    private JPanel createSelectorChatPanel() {
        JPanel chatPanel = new JPanel(new BorderLayout());

        JPanel innerPanel = new JPanel();
        chatPanel.add(innerPanel, BorderLayout.NORTH);
        JButton execButton = new JButton();
        execButton.setText("Create query");
        innerPanel.add(execButton);

        JTextField textFieldLabel = new JTextField("");
        textFieldLabel.setPreferredSize(new Dimension(850, 30));
        textFieldLabel.setEditable(false);
        innerPanel.add(textFieldLabel);

        return chatPanel;
    }

    private JPanel createSelectorMessagePanel() {
        JPanel messagePanel = new JPanel(new BorderLayout());

        JPanel innerPanel = new JPanel();
        messagePanel.add(innerPanel, BorderLayout.NORTH);
        JButton execButton = new JButton();
        execButton.setText("Create query");
        innerPanel.add(execButton);

        JTextField textFieldLabel = new JTextField();
        textFieldLabel.setPreferredSize(new Dimension(850, 30));
        textFieldLabel.setEditable(false);
        innerPanel.add(textFieldLabel);

        JPanel inputPanel = new JPanel();
        messagePanel.add(inputPanel, BorderLayout.CENTER);

        JLabel senderLabel = new JLabel("Sender:");
        JTextField senderTF = new JTextField();
        senderTF.setPreferredSize(new Dimension(300, 30));
        inputPanel.add(senderLabel);
        inputPanel.add(senderTF);

        JLabel sendTimeLabel = new JLabel("Send Time:");
        JTextField sendTimeTF = new JTextField();
        sendTimeTF.setPreferredSize(new Dimension(300, 30));
        inputPanel.add(sendTimeLabel);
        inputPanel.add(sendTimeTF);

        JLabel messageTextLabel = new JLabel("Message Text:");
        JTextField messageTextTF = new JTextField();
        messageTextTF.setPreferredSize(new Dimension(300, 30));
        inputPanel.add(messageTextLabel);
        inputPanel.add(messageTextTF);

        return messagePanel;
    }
}