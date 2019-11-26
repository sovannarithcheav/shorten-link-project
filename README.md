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
