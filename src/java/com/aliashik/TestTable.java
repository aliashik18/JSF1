
package com.aliashik;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TestTable implements Serializable {
    public TestTable(){}
    public TestTable(String name){
        this.name = name;
    }
    
    @Id
    @GeneratedValue
    private int id;
    
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }  
    
}
