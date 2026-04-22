package set.src;

import java.util.Date;
public class LogEntry {
    private String username;
    private Date  moment;

    public LogEntry(String username, Date moment) {
        this.username = username;
        this.moment = moment;
    }
    public String getUserName() {
        return username;
    }
    public void setUserName(String userName) {
        this.username = userName;
    }
    public Date getMoment() {
        return moment;
    }
    public void setMoment(Date moment) {
        this.moment = moment;
    }

    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((username == null) ? 0 : username.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        LogEntry other = (LogEntry) obj;
        if (username == null) {
            if (other.username != null)
                return false;
        } else if (!username.equals(other.username))
            return false;
        return true;
    }

    
}
