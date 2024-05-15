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
    private JPanel createSelectorServicePanel(){
        JPanel servicePanel = new JPanel();

        JLabel textFieldLabel = new JLabel();
        textFieldLabel.setPreferredSize(new Dimension(300, 30));
        textFieldLabel.setEnabled(false);
        textFieldLabel.setOpaque(true);
        servicePanel.add(textFieldLabel);

        JLabel urlLabel = new JLabel("URL:");
        JTextField urlTF = new JTextField();
        urlTF.setPreferredSize(new Dimension(300, 30));
        servicePanel.add(urlLabel);
        servicePanel.add(urlTF);

        JLabel localLabel = new JLabel("Localization:");
        JTextField localTF = new JTextField();
        localTF.setPreferredSize(new Dimension(300, 30));
        servicePanel.add(localLabel);
        servicePanel.add(localTF);

        return servicePanel;
    }

    private JPanel createSelectorRoomPanel(){
        JPanel roomPanel = new JPanel();

        JLabel textFieldLabel = new JLabel();
        textFieldLabel.setPreferredSize(new Dimension(300, 30));
        textFieldLabel.setEnabled(false);
        textFieldLabel.setOpaque(true);
        roomPanel.add(textFieldLabel);

        JLabel ownerLabel = new JLabel("Owner:");
        JTextField ownerTF = new JTextField();
        ownerTF.setPreferredSize(new Dimension(300, 30));
        roomPanel.add(ownerLabel);
        roomPanel.add(ownerTF);

        JLabel gameStageLabel = new JLabel("Game Stage:");
        JTextField gameStageTF = new JTextField();
        gameStageTF.setPreferredSize(new Dimension(300, 30));
        roomPanel.add(gameStageLabel);
        roomPanel.add(gameStageTF);

        JLabel timerLabel = new JLabel("Timer:");
        JTextField timerTF = new JTextField();
        timerTF.setPreferredSize(new Dimension(300, 30));
        roomPanel.add(timerLabel);
        roomPanel.add(timerTF);

        JLabel chatLabel = new JLabel("Chat:");
        JTextField chatTF = new JTextField();
        chatTF.setPreferredSize(new Dimension(300, 30));
        roomPanel.add(chatLabel);
        roomPanel.add(chatTF);

        return roomPanel;
    }

    private JPanel createSelectorUsersPanel(){
        JPanel usersPanel = new JPanel();

        JLabel textFieldLabel = new JLabel();
        textFieldLabel.setPreferredSize(new Dimension(300, 30));
        textFieldLabel.setEnabled(false);
        textFieldLabel.setOpaque(true);
        usersPanel.add(textFieldLabel);

        JLabel loginLabel = new JLabel("Login:");
        JTextField loginTF = new JTextField();
        loginTF.setPreferredSize(new Dimension(300, 30));
        usersPanel.add(loginLabel);
        usersPanel.add(loginTF);

        JLabel nameLabel = new JLabel("Name:");
        JTextField nameTF = new JTextField();
        nameTF.setPreferredSize(new Dimension(300, 30));
        usersPanel.add(nameLabel);
        usersPanel.add(nameTF);

        JLabel statusLabel = new JLabel("Status:");
        JTextField statusTF = new JTextField();
        statusTF.setPreferredSize(new Dimension(300, 30));
        usersPanel.add(statusLabel);
        usersPanel.add(statusTF);

        JLabel roleLabel = new JLabel("Role:");
        JTextField roleTF = new JTextField();
        roleTF.setPreferredSize(new Dimension(300, 30));
        usersPanel.add(roleLabel);
        usersPanel.add(roleTF);

        return usersPanel;
    }

    private JPanel createSelectorStatusPanel(){
        JPanel statusPanel = new JPanel();

        JLabel textFieldLabel = new JLabel();
        textFieldLabel.setPreferredSize(new Dimension(300, 30));
        textFieldLabel.setEnabled(false);
        textFieldLabel.setOpaque(true);
        statusPanel.add(textFieldLabel);

        JLabel isAliveLabel = new JLabel("Is Alive:");
        JTextField isAliveTF = new JTextField();
        isAliveTF.setPreferredSize(new Dimension(300, 30));
        statusPanel.add(isAliveLabel);
        statusPanel.add(isAliveTF);

        return statusPanel;
    }

    private JPanel createSelectorRolePanel(){
        JPanel rolePanel = new JPanel();

        JLabel textFieldLabel = new JLabel();
        textFieldLabel.setPreferredSize(new Dimension(300, 30));
        textFieldLabel.setEnabled(false);
        textFieldLabel.setOpaque(true);
        rolePanel.add(textFieldLabel);

        JLabel nameLabel = new JLabel("Name:");
        JTextField nameTF = new JTextField();
        nameTF.setPreferredSize(new Dimension(300, 30));
        rolePanel.add(nameLabel);
        rolePanel.add(nameTF);

        JLabel descriptionLabel = new JLabel("Description:");
        JTextField descriptionTF = new JTextField();
        descriptionTF.setPreferredSize(new Dimension(300, 30));
        rolePanel.add(descriptionLabel);
        rolePanel.add(descriptionTF);

        JLabel healthLabel = new JLabel("Health:");
        JTextField healthTF = new JTextField();
        healthTF.setPreferredSize(new Dimension(300, 30));
        rolePanel.add(healthLabel);
        rolePanel.add(healthTF);

        JLabel damageLabel = new JLabel("Damage:");
        JTextField damageTF = new JTextField();
        damageTF.setPreferredSize(new Dimension(300, 30));
        rolePanel.add(damageLabel);
        rolePanel.add(damageTF);

        JLabel winConditionLabel = new JLabel("Win Condition:");
        JTextField winConditionTF = new JTextField();
        winConditionTF.setPreferredSize(new Dimension(300, 30));
        rolePanel.add(winConditionLabel);
        rolePanel.add(winConditionTF);

        return rolePanel;
    }

    private JPanel createSelectorTimerPanel(){
        JPanel timerPanel = new JPanel();

        JLabel textFieldLabel = new JLabel();
        textFieldLabel.setPreferredSize(new Dimension(300, 30));
        textFieldLabel.setEnabled(false);
        textFieldLabel.setOpaque(true);
        timerPanel.add(textFieldLabel);

        JLabel triggerTimeLabel = new JLabel("Trigger Time:");
        JTextField triggerTimeTF = new JTextField();
        triggerTimeTF.setPreferredSize(new Dimension(300, 30));
        timerPanel.add(triggerTimeLabel);
        timerPanel.add(triggerTimeTF);

        JLabel currentTimeLabel = new JLabel("Current Time:");
        JTextField currentTimeTF = new JTextField();
        currentTimeTF.setPreferredSize(new Dimension(300, 30));
        timerPanel.add(currentTimeLabel);
        timerPanel.add(currentTimeTF);

        return timerPanel;
    }

    private JPanel createSelectorChatPanel(){
        JPanel chatPanel = new JPanel();

        JLabel textFieldLabel = new JLabel();
        textFieldLabel.setPreferredSize(new Dimension(300, 30));
        textFieldLabel.setEnabled(false);
        textFieldLabel.setOpaque(true);
        chatPanel.add(textFieldLabel);

        return chatPanel;
    }

    private JPanel createSelectorMessagePanel(){
        JPanel messagePanel = new JPanel();

        JLabel textFieldLabel = new JLabel();
        textFieldLabel.setPreferredSize(new Dimension(300, 30));
        textFieldLabel.setEnabled(false);
        textFieldLabel.setOpaque(true);
        messagePanel.add(textFieldLabel);

        JLabel senderLabel = new JLabel("Sender:");
        JTextField senderTF = new JTextField();
        senderTF.setPreferredSize(new Dimension(300, 30));
        messagePanel.add(senderLabel);
        messagePanel.add(senderTF);

        JLabel sendTimeLabel = new JLabel("Send Time:");
        JTextField sendTimeTF = new JTextField();
        sendTimeTF.setPreferredSize(new Dimension(300, 30));
        messagePanel.add(sendTimeLabel);
        messagePanel.add(sendTimeTF);

        JLabel messageTextLabel = new JLabel("Message Text:");
        JTextField messageTextTF = new JTextField();
        messageTextTF.setPreferredSize(new Dimension(300, 30));
        messagePanel.add(messageTextLabel);
        messagePanel.add(messageTextTF);

        return messagePanel;
    }

}
