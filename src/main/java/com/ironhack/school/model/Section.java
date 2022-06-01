package com.ironhack.school.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

    @Entity
    @Table(name = "section")
    public class Section {

        @Id
        private String id;
        private String courseCode;
        private Short roomNum;
        private String instructor;

        public Section(String id, String courseCode, Short roomNum, String instructor) {
            this.id = id;
            this.courseCode = courseCode;
            this.roomNum = roomNum;
            this.instructor = instructor;
        }

        public Section() {
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getCourseCode() {
            return courseCode;
        }

        public void setCourseCode(String courseCode) {
            this.courseCode = courseCode;
        }

        public Short getRoomNum() {
            return roomNum;
        }

        public void setRoomNum(Short roomNum) {
            this.roomNum = roomNum;
        }

        public String getInstructor() {
            return instructor;
        }

        public void setInstructor(String instructor) {
            this.instructor = instructor;
        }
    }
