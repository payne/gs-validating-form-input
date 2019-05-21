package hello;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

public class PersonForm {

    @NotNull
    @Size(min=2, max=30)
    private String name;

    @NotNull
    @Min(18)
    private Integer age;

    @NotNull
    @Min(2)
    private Integer yearsExperience;
    
    @NotEmpty
    @Email(message = "Email should be valid")
    private String email;

    // @NotEmpty
    // @Min(-9223372036854775808)
    // @Max(9223372036854775807)
    // This does nto work.  Min and Max are Integers, these are too large.
    // private Long exampleLong;
    // source: https://www.baeldung.com/javax-validation

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getYearsExperience() {
        return yearsExperience;
    }

    public void setYearsExperience(Integer yearsExperience) {
        this.yearsExperience = yearsExperience;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // public Long getLong() {
    //     return this.exampleLong;
    // }

    // public void setLong(Long exampleLong) {
    //     return this.exampleLong;
    // }

    public String toString() {
        return "Person(Name: " + this.name + ", Age: " + this.age + ")";
    }

    public void savePerson(String fileName, PersonForm person) {
        // to append a CSV line to a file -- the data in the line should be from one instance of PersonForm
        // 4) Write a method: savePerson(String fileName, PersonForm person) to append a CSV line to a file -- the data in the line should be from one instance of PersonForm
        
            String personData = getName() + ", " +  getAge() + ", " + getYearsExperience() + ", " + getEmail();
            
            FileWriter fileWriter = new FileWriter(fileName, true);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println(personData);
            printWriter.close();
        }
}
