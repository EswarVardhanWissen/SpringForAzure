# SpringForAzure

## To login into Docker from CLI
$ Docker login

# To Build the Docker image
$ docker build -t springwithazure .

# To run the docker image (on 8080 port)
$ docker run --name azurespring -p 8080:8080 springwithazure

# To add a tag to docker image
$ docker tag springwithazure eswarwissen/springwithazure

# To push to docker hub
$ docker push eswarwissen/springwithazure
