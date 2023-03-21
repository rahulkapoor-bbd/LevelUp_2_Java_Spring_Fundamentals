public abstract class Person {
    private String name;
	private String surname;
    private String id;
    

    public Person(String name, String id, String surname) {
        this.name = name;
        this.id = id;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public List<Subject> getAssignedSubjects();

    public void registerToSubject(Subject subject);
    
    //public abstract int getMarks(Subject subject);

    //public abstract void setMarks(Subject subject, int marks);
}
