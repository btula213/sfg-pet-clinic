##Some Random Notes

###Adding SSH Key to Github

* Generate the key 
  * ssh-keygen -t rsa -b 4096 -C your@email.com
* Make sure the ssh-agent is running 
  * eval ssh-agent -s or eval ("ssh-agent -s)"
* Add private key to the ssh-agent
  * ssh-add ~/.ssh/id_rsa
* Get the public key content
  * cat ~/.ssh/id_rsa.pub
* In the GitHub setting, go to SSH page and create a new ssh key.
* Paste the content of id_rsa.pub key

Check if the GitHub configuration is successful.

    user@users-MacBook-Pro sfg-pet-clinic % ssh -T git@github.com
    Hi <username>! You've successfully authenticated, but GitHub does not provide shell access.


##Process to release an application using mvn

    %mvn release:prepare
    %mvn release:perform
 
