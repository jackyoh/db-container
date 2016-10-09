Build docker file command:

```
docker build -t jackyoh/postgresql:8.4 .
```

Start container command:

```
docker run -d -p 5432:5432 --restart=always --name postgreServer jackyoh/postgresql:8.4
```

Remove container command:
```
docker rm -f postgreServer 
```
