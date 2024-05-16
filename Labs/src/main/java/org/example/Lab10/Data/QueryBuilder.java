package org.example.Lab10.Data;

import org.example.Lab10.Data.Models.*;

import java.lang.reflect.Field;

public class QueryBuilder {
    public String buildQuery(Object model, CRUDMode mode) {
        switch (mode) {
            case CREATE:
                return buildCreateQuery(model);
            case READ:
                return buildReadQuery(model);
            case UPDATE:
                return buildUpdateQuery(model);
            case DELETE:
                return buildDeleteQuery(model);
            default:
                return null;
        }
    }

    private String buildCreateQuery(Object model) {
        if (model instanceof Service) {
            return buildCreateServiceQuery((Service) model);
        } else if (model instanceof Room) {
            return buildCreateRoomQuery((Room) model);
        } else if (model instanceof User) {
            return buildCreateUsersQuery((User) model);
        } else if (model instanceof Status) {
            return buildCreateStatusQuery((Status) model);
        } else if (model instanceof Role) {
            return buildCreateRoleQuery((Role) model);
        } else if (model instanceof Timer) {
            return buildCreateTimerQuery((Timer) model);
        } else if (model instanceof Chat) {
            return buildCreateChatQuery((Chat) model);
        } else if (model instanceof Message) {
            return buildCreateMessageQuery((Message) model);
        } else {
            return null;
        }
    }

    private String buildReadQuery(Object model) {
        if (model instanceof Service) {
            return "SELECT * FROM Service " + buildWhereQuery(model);
        } else if (model instanceof Room) {
            return "SELECT * FROM Room " + buildWhereQuery(model);
        } else if (model instanceof User) {
            return "SELECT * FROM Users " + buildWhereQuery(model);
        } else if (model instanceof Status) {
            return "SELECT * FROM Status " + buildWhereQuery(model);
        } else if (model instanceof Role) {
            return "SELECT * FROM Role " + buildWhereQuery(model);
        } else if (model instanceof Timer) {
            return "SELECT * FROM Timer " + buildWhereQuery(model);
        } else if (model instanceof Chat) {
            return "SELECT * FROM Chat " + buildWhereQuery(model);
        } else if (model instanceof Message) {
            return "SELECT * FROM Message " + buildWhereQuery(model);
        } else {
            return null;
        }
    }
    private String buildWhereQuery(Object model) {
        if (model instanceof Service) {
            return buildWhereClause((Service) model);
        } else if (model instanceof Room) {
            return buildWhereClause((Room) model);
        } else if (model instanceof User) {
            return buildWhereClause((User) model);
        } else if (model instanceof Status) {
            return buildWhereClause((Status) model);
        } else if (model instanceof Role) {
            return buildWhereClause((Role) model);
        } else if (model instanceof Timer) {
            return buildWhereClause((Timer) model);
        } else if (model instanceof Chat) {
            return buildWhereClause((Chat) model);
        } else if (model instanceof Message) {
            return buildWhereClause((Message) model);
        } else {
            return null;
        }
    }

    private String buildWhereClause(Service service) {
        return buildWhereClauseFromObject(service, "ServiceID");
    }

    private String buildWhereClause(Room room) {
        return buildWhereClauseFromObject(room, "RoomID");
    }

    private String buildWhereClause(User user) {
        return buildWhereClauseFromObject(user, "UserID");
    }

    private String buildWhereClause(Status status) {
        return buildWhereClauseFromObject(status, "StatusID");
    }

    private String buildWhereClause(Role role) {
        return buildWhereClauseFromObject(role, "RoleID");
    }

    private String buildWhereClause(Timer timer) {
        return buildWhereClauseFromObject(timer, "TimerID");
    }

    private String buildWhereClause(Chat chat) {
        return buildWhereClauseFromObject(chat, "ChatID");
    }

    private String buildWhereClause(Message message) {
        return buildWhereClauseFromObject(message, "MessageID");
    }

    private String buildWhereClauseFromObject(Object obj, String idFieldName) {
        StringBuilder whereClause = new StringBuilder();
        boolean isFirstCondition = true;

        try {
            Class<?> clazz = obj.getClass();
            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                field.setAccessible(true);
                Object value = field.get(obj);
                if (value != null) {
                    if (!isFirstCondition) {
                        whereClause.append(" AND ");
                    } else {
                        whereClause.append("WHERE ");
                        isFirstCondition = false;
                    }
                    whereClause.append(field.getName()).append(" = ");
                    if (field.getType() == String.class) {
                        whereClause.append("'").append(value).append("'");
                    } else {
                        whereClause.append(value);
                    }
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        if (whereClause.length() == 0) {
            return null;
        }

        return whereClause.toString();
    }


    private String buildUpdateQuery(Object model) {
        if (model instanceof Service) {
            return buildUpdateServiceQuery((Service) model);
        } else if (model instanceof Room) {
            return buildUpdateRoomQuery((Room) model);
        } else if (model instanceof User) {
            return buildUpdateUsersQuery((User) model);
        } else if (model instanceof Status) {
            return buildUpdateStatusQuery((Status) model);
        } else if (model instanceof Role) {
            return buildUpdateRoleQuery((Role) model);
        } else if (model instanceof Timer) {
            return buildUpdateTimerQuery((Timer) model);
        } else if (model instanceof Chat) {
            return buildUpdateChatQuery((Chat) model);
        } else if (model instanceof Message) {
            return buildUpdateMessageQuery((Message) model);
        } else {
            return null;
        }
    }

    private String buildUpdateServiceQuery(Service service) {
        return "UPDATE Service SET URL = '" + service.getURL() + "', Localization = '" + service.getLocalization() + "' WHERE ID = ?";
    }

    private String buildUpdateRoomQuery(Room room) {
        return "UPDATE Room SET Owner = " + room.getOwner() + ", GameStage = '" + room.getGameStage() + "', Timer = " + room.getTimer() + ", Chat = " + room.getChat() + " WHERE ID = ?";
    }

    private String buildUpdateUsersQuery(User user) {
        return "UPDATE Users SET Login = '" + user.getLogin() + "', Name = '" + user.getName() + "', Status = " + user.getStatus() + ", Role = " + user.getRole() + " WHERE ID = ?";
    }

    private String buildUpdateStatusQuery(Status status) {
        return "UPDATE Status SET IsAlive = " + (status.isAlive() ? 1 : 0) + " WHERE StatusID = ?";
    }

    private String buildUpdateRoleQuery(Role role) {
        return "UPDATE Role SET Name = '" + role.getName() + "', Description = '" + role.getDescription() + "', Health = " + role.getHealth() + ", Damage = " + role.getDamage() + ", WinCondition = '" + role.getWinCondition() + "' WHERE ID = ?";
    }

    private String buildUpdateTimerQuery(Timer timer) {
        return "UPDATE Timer SET TriggerTime = " + timer.getTriggerTime() + ", CurrentTime = " + timer.getCurrentTime() + " WHERE ID = ?";
    }

    private String buildUpdateChatQuery(Chat chat) {
        StringBuilder queryBuilder = new StringBuilder("UPDATE Chat SET ");
        queryBuilder.append("ID = ").append(chat.getID());
        queryBuilder.append("WHERE ChatID = ?");
        return queryBuilder.toString();
    }

    private String buildUpdateMessageQuery(Message message) {
        StringBuilder queryBuilder = new StringBuilder("UPDATE Message SET ");
        queryBuilder.append("Sender = ").append(message.getSender()).append(", ");
        queryBuilder.append("SendTime = ").append(message.getSendTime()).append(", ");
        queryBuilder.append("MessageText = '").append(message.getMessageText()).append("' ");
        queryBuilder.append("WHERE MessageID = ?");
        return queryBuilder.toString();
    }

    private String buildDeleteQuery(Object model) {
        if (model instanceof Service) {
            return "DELETE FROM Service " + buildWhereQuery(model);
        } else if (model instanceof Room) {
            return "DELETE FROM Room " + buildWhereQuery(model);
        } else if (model instanceof User) {
            return "DELETE FROM Users " + buildWhereQuery(model);
        } else if (model instanceof Status) {
            return "DELETE FROM Status " + buildWhereQuery(model);
        } else if (model instanceof Role) {
            return "DELETE FROM Role " + buildWhereQuery(model);
        } else if (model instanceof Timer) {
            return "DELETE FROM Timer " + buildWhereQuery(model);
        } else if (model instanceof Chat) {
            return "DELETE FROM Chat " + buildWhereQuery(model);
        } else if (model instanceof Message) {
            return "DELETE FROM Message " + buildWhereQuery(model);
        } else {
            return null;
        }
    }

    private String buildCreateServiceQuery(Service service) {
        return "INSERT INTO Service (URL, Localization) VALUES ('" + service.getURL() + "', '" + service.getLocalization() + "')";
    }

    private String buildCreateRoomQuery(Room room) {
        return "INSERT INTO Room (Owner, GameStage, Timer, Chat) VALUES (" + room.getOwner() + ", '" + room.getGameStage() + "', " + room.getTimer() + ", " + room.getChat() + ")";
    }

    private String buildCreateUsersQuery(User user) {
        return "INSERT INTO Users (Login, Name, Status, Role) VALUES ('" + user.getLogin() + "', '" + user.getName() + "', " + user.getStatus() + ", " + user.getRole() + ")";
    }

    private String buildCreateStatusQuery(Status status) {
        return "INSERT INTO Status (IsAlive) VALUES (" + (status.isAlive() ? 1 : 0) + ")";
    }

    private String buildCreateRoleQuery(Role role) {
        return "INSERT INTO Role (Name, Description, Health, Damage, WinCondition) VALUES ('" + role.getName() + "', '" + role.getDescription() + "', " + role.getHealth() + ", " + role.getDamage() + ", '" + role.getWinCondition() + "')";
    }

    private String buildCreateTimerQuery(Timer timer) {
        return "INSERT INTO Timer (TriggerTime, CurrentTime) VALUES (" + timer.getTriggerTime() + ", " + timer.getCurrentTime() + ")";
    }

    private String buildCreateChatQuery(Chat chat) {
        return "INSERT INTO Chat DEFAULT VALUES";
    }

    private String buildCreateMessageQuery(Message message) {
        return "INSERT INTO Message (Sender, SendTime, MessageText) VALUES (" + message.getSender() + ", " + message.getSendTime() + ", '" + message.getMessageText() + "')";
    }
}
