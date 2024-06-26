package za.ac.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Student;
import za.ac.cput.repository.StudentRepository;

import java.util.List;

@Service
public class StudentService implements IService<Student, String> {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student create(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student read(String studentID) {
        return studentRepository.findByStudentID(studentID);
    }

    @Override
    public Student update(Student student) {
        return studentRepository.save(student);
    }

    public void delete(String studentID) {
        studentRepository.deleteByStudentID(studentID);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAllStudents();
    }
}
