# How To Customize Ubuntu Or Linux Mint Live ISO With Cubic

Cubic, or Custom Ubuntu ISO Creator, is a GUI that can be used to create a custom bootable Ubuntu Live CD (ISO). While the application is targeted at Ubuntu, it also works on Linux Mint / is able to create a custom Linux Mint ISO. This article includes step by step instructions for how to create your custom Ubuntu or Linux Mint ISO using Cubic.

<img src="https://i.imgur.com/HkMpX0w.jpg" width="550"/>

## Installing and using Cubic to create a custom Linux Mint or Ubuntu ISO

```
sudo add-apt-repository ppa:cubic-wizard/release
sudo apt update
sudo apt install cubic
```

### 1. Launch Cubic from your desktop menu and select a directory for your new project.

<img src="https://i.imgur.com/uvgoGyp.png" width="550"/>

Simply create a new empty folder and select it from Cubic. This is the directory where Cubic will extract the ISO and also where it will save the final, customized Ubuntu / Linux Mint Live ISO file.

### 2. Select the ISO you want to customize.

This can be Ubuntu, Linux Mint, any Ubuntu or Mint flavor, and probably other Ubuntu-based Linux distributions.

<img src="https://i.imgur.com/ueeKDXY.png" width="550"/>

Once you're done, click Next.

Cubic will now extract the compressed Linux file system from the ISO and copy some files from the original disk image.

### 3. On the next screen, Cubic displays an embedded terminal window with a chroot environment. This is where you can customize the ISO.

<img src="https://i.imgur.com/ykrvgEL.png" width="550"/>

From this command line chroot, customize the ISO to suit your needs. Install extra packages (applications, libraries, kernel images, etc.), remove any installed packages, add or remove PPAs or other third-party repositories, download external packages and install them on the custom Linux Mint or Ubuntu ISO image, change configuration files and anything else you'd like.

Note : There's no need to use sudo, you're already logged in as root in the chroot environment.

Ubuntu only: By default, Ubuntu enables only the main and restricted repositories on the Live CD ISO. So to be able to install some packages, you'll also need to enable the universe and multiverse repositories. Here is how to do that.

In the Cubic chroot, type:
```
nano /etc/apt/sources.list
```
After each line (there should only be 3 lines), add a space and then add this: universe multiverse, like in this screenshot:

<img src="https://i.imgur.com/D6LEdxb.png" width="550"/>

To save the changes made to the sources.list file, press Ctrl + O and Enter, and then Ctrl + X to exit Nano command line text editor.

Now run apt update and you should be able to install software that's available in the Ubuntu universe and multiverse repositories:

But if you have problem with `apt-get update`,you're probably missing file /etc/resolv.conf, so create one and the content of it should be : 
```
nameserver 8.8.8.8
nameserver 8.8.4.4
```
<img src="https://i.imgur.com/Nm9pBOl.png" width="550"/>

Once you're done making your changes, click the Next button.

### 4. Choose which Linux kernel to use and packages from a typical install to remove.

<img src="https://i.imgur.com/4Fz49YH.png" width="550"/>

For most cases it's recommended leaving these options to their default values.

Click Generate and the ISO generation process should begin. Click Finish after it's done

### 5. And... it's done!

In the final step Cubic lists the path where it saved the generated custom ISO file (by default it's saved in the folder you've selected in step 1), the release and disk name, and so on.


















# shorten-link-project
Project for Shorten link using Spring Boot

<img src="https://i.imgur.com/NxKXkBA.png" width="550"/>


## Usage

- input the link you want to shorten, then will return the shorten-url back to you.


## Set up

- DB : mysql/h2
- maven project
- run on port: 8080
- web interface endpoint: / or /index
- api shorten (post method): /
- api get original: /{shorten}
