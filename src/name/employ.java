/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package name;

/**
 *
 * @author srivenkatasatyaakhilmalladi
 */
public class employ {
    private String name;
    private int employeeid;
    private int age;
    private String gender;
    private String start_date;
    private int level;
    private String team_into;
    private String pos_title;
    private String email_id;
    private long cell_no;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getTeam_into() {
        return team_into;
    }

    public void setTeam_into(String team_into) {
        this.team_into = team_into;
    }

    public String getPos_title() {
        return pos_title;
    }

    public void setPos_title(String pos_title) {
        this.pos_title = pos_title;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public long getCell_no() {
        return cell_no;
    }

    public void setCell_no(int cell_no) {
        this.cell_no = cell_no;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
           
  
}
