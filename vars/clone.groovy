// vars/clone.groovy
def call(string url,string branch) {
     echo 'clonning from git'
     git url : '${url}', branch :'${branch}'
    echo 'git clone successful'
}
