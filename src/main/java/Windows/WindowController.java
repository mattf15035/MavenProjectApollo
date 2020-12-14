/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Windows;

/**
 *
 * @author Matt
 */
public class WindowController {
    private appMenu appMenu;
    private Shoot Shoot;
    private aboutApp aboutApp;
    private chooseProfile chooseProfile;
    private createProfile createProfile;
    private mainMenu mainmenu;
    private shootSelection shootSelection;

    public appMenu getAppMenu() {
        return appMenu;
    }

    public void setAppMenu(appMenu appMenu) {
        this.appMenu = appMenu;
    }

    public Shoot getShoot() {
        return Shoot;
    }

    public void setShoot(Shoot Shoot) {
        this.Shoot = Shoot;
    }

    public aboutApp getAboutApp() {
        return aboutApp;
    }

    public void setAboutApp(aboutApp aboutApp) {
        this.aboutApp = aboutApp;
    }

    public chooseProfile getChooseProfile() {
        return chooseProfile;
    }

    public void setChooseProfile(chooseProfile chooseProfile) {
        this.chooseProfile = chooseProfile;
    }

    public createProfile getCreateProfile() {
        return createProfile;
    }

    public void setCreateProfile(createProfile createProfile) {
        this.createProfile = createProfile;
    }

    public mainMenu getMainmenu() {
        return mainmenu;
    }

    public void setMainmenu(mainMenu mainmenu) {
        this.mainmenu = mainmenu;
    }

    public shootSelection getShootSelection() {
        return shootSelection;
    }

    public void setShootSelection(shootSelection shootSelection) {
        this.shootSelection = shootSelection;
    }
    
    
}

