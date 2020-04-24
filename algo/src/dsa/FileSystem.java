package dsa;

import java.io.File;

class FileSystem {

    static long fileSize = 0;
    public static void main(String[] args) {
        File file = new File("/Users/I336545/Documents/learnings/firewire");
        fileSize = computeDiskspace(file);
        System.out.println(fileSize);
        
    }

    private static long computeDiskspace(File file) {
       
        fileSize  += file.length();
        if(file.isDirectory()) {
            for(String name : file.list()){
                File ftemp = new File(file, name);
                System.out.println(file.getName()+"\t"+name);
                fileSize += computeDiskspace(ftemp);
            }
        }
        return fileSize;

    }
}