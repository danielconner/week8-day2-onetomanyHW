import db.DBHelper;
import models.File;
import models.Folder;
import models.Owner;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Owner owner1 = new Owner("Mark", "TechGenius");
        DBHelper.save(owner1);

        Folder folder1 = new Folder("Mortgage Information", owner1);
        DBHelper.save(folder1);
        Folder folder2 = new Folder("Java Project", owner1);
        DBHelper.save(folder2);
        Folder folder3 = new Folder("Passion Project", owner1 );
        DBHelper.save(folder3);




        File file1 = new File("House Files", ".txt", 512, folder1 );
        DBHelper.save(file1);
        File file2 = new File("Framework", ".java", 12, folder2);
        DBHelper.save(file2);
        File file3 = new File("RUNNER", ".java", 1210, folder2);
        DBHelper.save(file3);
        File file4 = new File("DRAWING", ".jpg", 12, folder3);
        DBHelper.save(file4);
        File file5 = new File("plans", ".pneg", 191, folder3);
        DBHelper.save(file5);
        File file6 = new File("Contacts", ".txt", 300, folder3);
        DBHelper.save(file6);


        List<File> allFiles = DBHelper.getAll(File.class);
        List<Folder> allFolders = DBHelper.getAll(Folder.class);

        List<File> allFilesByFolder = DBHelper.getAllFilesInAFolder(folder1);
        List<Folder> allFoldersByFile = DBHelper.getAllFolderByOwner(owner1);
    }
}
