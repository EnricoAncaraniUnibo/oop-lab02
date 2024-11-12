package it.unibo.constructors;

class Student {

    String name;
    String surname;
    int id;
    int matriculationYear;

    public Student(String nameInput, String surnameInput, int idInput, int matriculationYearInput) {
        this.name=nameInput;
        this.surname=surnameInput;
        this.id=idInput;
        this.matriculationYear=matriculationYearInput;
    }

    void printStudentInfo() {
        System.out.println("Student id: " + this.id);
        System.out.println("Student name: " + this.name);
        System.out.println("Student surname: " + this.surname);
        System.out.println("Student matriculationYear: " + this.matriculationYear + "\n");
    }
}
