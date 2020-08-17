/**
 * Project Name:community
 * File Name:T_jobs
 * Package Name:life.majiang.community.test.ORM
 * Date:2020/8/12 14:52
 * Copyright (c) 2020, cbq@bostech.com All Rights Reserved.
 */
package life.majiang.community.test.ORM;

/**
 * TODO
 * @author 程碧泉
 * @since JDK1.7
 * @history 2020/8/12 程碧泉 新建
 */
public class T_jobs {
    private String job_id;
    private String job_title;
    private String min_salary;
    private String max_salary;

    public T_jobs() {
    }

    public T_jobs(String job_id, String job_title, String min_salary, String max_salary) {
        this.job_id = job_id;
        this.job_title = job_title;
        this.min_salary = min_salary;
        this.max_salary = max_salary;
    }

    public String getJob_id() {
        return job_id;
    }

    public void setJob_id(String job_id) {
        this.job_id = job_id;
    }

    public String getJob_title() {
        return job_title;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    public String getMin_salary() {
        return min_salary;
    }

    public void setMin_salary(String min_salary) {
        this.min_salary = min_salary;
    }

    public String getMax_salary() {
        return max_salary;
    }

    public void setMax_salary(String max_salary) {
        this.max_salary = max_salary;
    }

    @Override
    public String toString() {
        return "T_jobs{" + "job_id='" + job_id + '\'' + ", job_title='" + job_title + '\'' + ", min_salary='" + min_salary + '\'' + ", max_salary='" + max_salary + '\'' + '}';
    }
}
