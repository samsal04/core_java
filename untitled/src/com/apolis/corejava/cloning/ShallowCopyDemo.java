    package com.apolis.corejava.cloning;

    public class ShallowCopyDemo {
        public static void main(String[] args) {
            Course science= new Course("Physics", "Math", "Biology");

            Students student1= new Students(10,"student1",science);
            Students student2= null;

            try{
                student2= (Students) student1.clone();
            }
            catch(CloneNotSupportedException c){
                c.printStackTrace();

            }

            System.out.println(student1.course.subject3);

            student2.course.subject3="History";
            System.out.println(student1.course.subject3);

        }






    }

    class Course {
        String subject1;
        String subject2;
        String subject3;

        public Course(String subject1, String subject2, String subject3) {
            this.subject1 = subject1;
            this.subject2 = subject2;
            this.subject3 = subject3;
        }
    }

    class Students implements  Cloneable{

        int id;
        String name;
        Course course;

        public Students(int id, String name, Course course) {
            this.id = id;
            this.name = name;
            this.course = course;
        }

        protected Object clone() throws  CloneNotSupportedException{

            return super.clone();
        }
    }