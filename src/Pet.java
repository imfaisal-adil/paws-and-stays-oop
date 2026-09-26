/**
 * Abstract Base Class: Pet
 * Serves as the root parent class (Level 1) of the Pet inheritance hierarchy.
 */
public abstract class Pet {
    
    // ENCAPSULATION
    private String petId;
    private String petName;
    private int age;
    private String breed;
    private String ownerName;
    private String ownerPhone;
    private boolean isVaccinated;

    // =========================================================================
    // CONSTRUCTOR OVERLOADING
    // =========================================================================

    /**
     * Overloaded Constructor 1: Default / No-argument Constructor
     */
    public Pet() {
        this("P-0000", "Unnamed Pet", 1, "Unknown Breed", "Unknown Owner", "000-000-0000", true);
    }

    /**
     * Overloaded Constructor 2: Full Initializer
     * Complete state initialization using constructor chaining.
     */
    public Pet(String petId, String petName, int age, String breed, 
               String ownerName, String ownerPhone, boolean isVaccinated) {
        this.petId = petId;
        this.petName = petName;
        setAge(age); 
        this.breed = breed;
        this.ownerName = ownerName;
        this.ownerPhone = ownerPhone;
        this.isVaccinated = isVaccinated;
    }

    /**
     * ABSTRACTION: Abstract method declaring WHAT care description behavior is required
     */
    public abstract String describeCare();

    // =========================================================================
    // ENCAPSULATION: GETTERS AND SETTERS
    // =========================================================================

    public String getPetId() {
        return petId;
    }

    public void setPetId(String petId) {
        this.petId = petId;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 1) {
            throw new IllegalArgumentException("Validation Error: Pet age must be at least 1 month (cannot be zero or negative).");
        }
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerPhone() {
        return ownerPhone;
    }

    public void setOwnerPhone(String ownerPhone) {
        this.ownerPhone = ownerPhone;
    }

    public boolean isVaccinated() {
        return isVaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        isVaccinated = vaccinated;
    }

    
    // METHOD OVERRIDING 
    @Override
    public String toString() {
        return String.format("Pet [ID: %s | Name: %s | Age: %d months | Breed: %s | Owner: %s (%s) | Vaccinated: %s]",
                petId, petName, age, breed, ownerName, ownerPhone, isVaccinated ? "YES" : "NO");
    }
}
