# Git使用方式

### 与github建立ssh连接

- 找到本地.ssh文件夹的上一层

- 右键打开git bash

- 输入命令 $ ssh-keygen -t rsa -C "youxiang@qq.com"

- 使用记事本打开公钥id_rsa.pub文件，复制全部内容

- 打开github，进入setting，找到SSH and GPG keys

- 点击new SSH key

- 输入名称，粘贴公钥，添加

### 关联github仓库

- 找到github仓库，点击Code按钮（绿色的）

- 复制HTTPS下的链接，类似于https://github.com/jdskfhkadjjl/MyBookManage.git

- 打开本地文件夹，初始化 git init

- 关联github仓库，git remote add origin https://github.com/jdskfhkadjjl/MyBookManage.git

### 使用git推送，拉取代码

- 由于新建的远程仓库是空的，所以要加上-u这个参数
  `git push -u origin master`
- 之后仓库不是空的，就不用加上-u
  `git push origin master`

- 拉取项目

  `git clone https://github.com/jdskfhkadjjl/MyBookManage.git `
