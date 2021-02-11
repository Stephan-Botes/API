package kerneels.mvc.models;

import javax.persistence.*;

@Entity() // Will be used by JPA, is stored in DB
@Table(name="Issues") // Name of Table in DB

public class Issues {
    @Id // Sets this as PK for JPA
    @GeneratedValue(strategy = GenerationType.AUTO) // Tells JPA that the DB will generate this itself
    public long ID;
    public long IssueID;
    public String Title;
    public String PublicationDate;
    public String Publisher;
    public long SeriesNumber;
    public String Description;
    public String CoverImage;
}
