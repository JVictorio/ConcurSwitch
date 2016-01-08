# ConcurSwitch
Concur Switch Services

#Load test data in Mongodb
1. Run mongodb: $ mongod --config /usr/local/etc/mongod.conf
2. Import data: $ mongoimport --db concur --collection jenkins --drop --file ../ConcurSwitch/src/test/data/jenkinsdata_mongo.json

# Test import of data
$ mongo
$> show db ==> will show all mongodb db's
$> use concur => will use concur db instance
$> show collections => will show all collections in the concur db
$> db.jenkins.count => will show # of documents in concur.jenkins collection
$> db.jenkins.find() => will show all documents in concur.jenkins collection