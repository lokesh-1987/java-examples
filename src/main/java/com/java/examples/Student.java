package com.java.examples;

public class Student {

    private Integer id;
    private String name;
    private Integer marks;

    public Student(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.marks = builder.marks;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMarks() {
        return marks;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }

    public static class Builder {
        private Integer id;
        private String name;
        private Integer marks;
       
       public Builder id(int id) {
           this.id = id;
           return this;
       }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder marks(int marks) {
            this.marks = marks;
            return this;
        }
        
        public Student build() {
           return new Student(this);
        }
    }
}
