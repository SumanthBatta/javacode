package Strings;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;

public class Student {

    // ---------- Student POJO ----------
    static class Student1 {
        private int studentId;
        private String name;
        private List<Course> courses;

        public int getStudentId() { return studentId; }
        public void setStudentId(int studentId) { this.studentId = studentId; }

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        public List<Course> getCourses() { return courses; }
        public void setCourses(List<Course> courses) { this.courses = courses; }
    }

    // ---------- Course POJO ----------
    static class Course {
        private String courseId;
        private String courseName;

        public String getCourseId() { return courseId; }
        public void setCourseId(String courseId) { this.courseId = courseId; }

        public String getCourseName() { return courseName; }
        public void setCourseName(String courseName) { this.courseName = courseName; }
    }

    // ---------- MAIN METHOD ----------
    public static void main(String[] args) throws Exception {

        String json = """
                [{
                  "studentId": 101,
                  "name": "John",
                  "courses": [
                    { "courseId": "C101", "courseName": "Math" },
                    { "courseId": "C102", "courseName": "Physics" }
                  ]
                },
                {
                  "studentId": 102,
                  "name": "Kiran",
                  "courses": [
                    { "courseId": "C103", "courseName": "English" },
                    { "courseId": "C104", "courseName": "social" }
                  ]
                }
                ]
                """;
        ObjectMapper mapper = new ObjectMapper();
//        Student1 student = mapper.readValue(json, Student1.class);
        List<Student1> student1List = mapper.readValue(json,mapper.getTypeFactory().constructCollectionType(List.class,Student1.class));
        List<Student1> students = mapper.readValue(json,mapper.getTypeFactory().constructCollectionType(List.class,Student1.class));
        String courseId = "C104";
        int studentId = 102;
        String studentName = getStudentNameById(students, studentId);

        Course course = findByCourseId(students,courseId);
        if (course != null) {
            System.out.println("Course Found: " + course.getCourseName());
        } else {
            System.out.println("Course Not Found");
        }
        System.out.println(studentName);
    }
    public static Course findByCourseId(List<Student1> students, String courseId) {
        for (Student1 student : students) {
            Course course = student.getCourses().stream().filter(c -> c.getCourseId().equals(courseId)).findFirst().orElse(null);
            if (course != null) {
                return course;
            }

        }
        return null;
    }



    public static String  getStudentNameById(List<Student1> students, int studentId){
//        for(Student1 student1 : students){
//            if(student1.studentId==studentId){
//               return student1.getName();
//            }
//        }
//        return null;
       return students.stream().filter(s->s.getStudentId()==studentId).map(Student1::getName).findFirst().orElse(null);
    }

}
