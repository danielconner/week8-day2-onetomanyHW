package models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "owners")
public class Owner {

    private int id;
    private String name;
    private String userName;
    private Set<Folder> folder;

    public Owner() {
    }

    public Owner(String name, String userName) {
        this.name = name;
        this.userName = userName;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "username")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @OneToMany(mappedBy = "owner", fetch = FetchType.EAGER, orphanRemoval = true)
    public Set<Folder> getFolder() {
        return folder;
    }

    public void setFolder(Set<Folder> folder) {
        this.folder = folder;
    }
}
