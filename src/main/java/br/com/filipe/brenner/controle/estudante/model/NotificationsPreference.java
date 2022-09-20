package br.com.filipe.brenner.controle.estudante.model;

import br.com.filipe.brenner.controle.estudante.model.Enum.DayOfWeek;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.sql.Time;
import java.util.List;

@Entity
@Table(name = "user_notifications_preference")
public class NotificationsPreference {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    private UserModel owner;

    private boolean notifyCurrentDayActivities;

    private boolean notifyCurrentWeekActivities;

    private Time timeToSendDailyNotifications;

    private Time timeToSendWeeklyNotifications;

    @Enumerated(EnumType.STRING)
    private DayOfWeek dayToSendWeeklyNotification;

    @ManyToMany
    @JoinTable(name="user_notifications_preference_subject_to_notify",
            joinColumns={@JoinColumn(name="user_id",
                    referencedColumnName="id")},
            inverseJoinColumns={@JoinColumn(name="subject_id",
                    referencedColumnName="id")})
    private List<Subject> subjectsToNotify;

    public boolean isNotifyCurrentDayActivities() {
        return notifyCurrentDayActivities;
    }

    public UserModel getOwner() {
        return owner;
    }

    public void setOwner(UserModel owner) {
        this.owner = owner;
    }

    public void setNotifyCurrentDayActivities(boolean notifyCurrentDayActivities) {
        this.notifyCurrentDayActivities = notifyCurrentDayActivities;
    }

    public boolean isNotifyCurrentWeekActivities() {
        return notifyCurrentWeekActivities;
    }

    public void setNotifyCurrentWeekActivities(boolean notifyCurrentWeekActivities) {
        this.notifyCurrentWeekActivities = notifyCurrentWeekActivities;
    }

    public Time getTimeToSendDailyNotifications() {
        return timeToSendDailyNotifications;
    }

    public void setTimeToSendDailyNotifications(Time timeToSendDailyNotifications) {
        this.timeToSendDailyNotifications = timeToSendDailyNotifications;
    }

    public Time getTimeToSendWeeklyNotifications() {
        return timeToSendWeeklyNotifications;
    }

    public void setTimeToSendWeeklyNotifications(Time timeToSendWeeklyNotifications) {
        this.timeToSendWeeklyNotifications = timeToSendWeeklyNotifications;
    }

    public DayOfWeek getDayToSendWeeklyNotification() {
        return dayToSendWeeklyNotification;
    }

    public void setDayToSendWeeklyNotification(DayOfWeek dayToSendWeeklyNotification) {
        this.dayToSendWeeklyNotification = dayToSendWeeklyNotification;
    }

    public List<Subject> getSubjectsToNotify() { return subjectsToNotify; }

    public void setSubjectsToNotify(List<Subject> subjectsToNotify) { this.subjectsToNotify = subjectsToNotify; }

}
