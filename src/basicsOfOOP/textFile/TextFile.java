package basicsOfOOP.textFile;

public class TextFile {
    private File file;
    private Directory directory;

    public void rename(String name){
        file.setName(name);
    }
    public void outPut(){
        System.out.println(file.getContent());

    }
    public void addContent(String text){

        file.setContent(file.getContent()+text);
    }
    public void remove(File file){
        directory=null ;
        this.file=null;
    }


    public TextFile(File file, Directory directory) {
        this.file = file;
        this.directory = directory;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public Directory getDirectory() {
        return directory;
    }

    public void setDirectory(Directory directory) {
        this.directory = directory;
    }
}
