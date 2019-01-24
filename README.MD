SpringBoot Mongo App


### MongoDB changes so I won't forget again
1. Installed MongoDB using homebrew, by default, the databases were supposed to be
stored at the location `/usr/local/var/mongodb/`. But I changed the location to `/Users/rohith/workspace/mongodb-data`. This setting is in  `/usr/local/etc/mongod.conf`
2. If needed, check the mongodb logs at `/usr/local/var/log/mongodb/`
3. The mongo binaries are here: `/usr/local/Cellar/mongodb`
4. To start mongodb, `mongod --dbpath /Users/rohith/workspace/mongodb-data/`
5. To connect to it from CLI, run `mongo` on another tab once the above command is executed.
6. To Shut down the `mongodb` server, do the following from the `mongo` shell.
```
use admin
db.shutdownServer()
```

P.S - Use Robo3T installed on mac to browse the databases instead of CLI.... easier that way.
