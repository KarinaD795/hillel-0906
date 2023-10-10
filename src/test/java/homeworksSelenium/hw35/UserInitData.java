package homeworksSelenium.hw35;

public class UserInitData {

    private String name;
    private String job;

    public UserInitData(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public UserInitData() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

}
