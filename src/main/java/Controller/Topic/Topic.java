package Controller.Topic;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Topic {
    private final String id;
    private final String empName;


    public Topic(@JsonProperty("id") String id,
                 @JsonProperty("empname") String empName) {
        this.id = id;
        this.empName = empName;
    }

    public String getId() {
        return id;
    }

    public String getEmpName() {
        return empName;
    }

}