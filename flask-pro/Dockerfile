FROM python:3.11.0a3-slim

WORKDIR /usr/src/app

COPY requirements.txt ./
RUN pip install --no-cache-dir -r requirements.txt -i http://pypi.douban.com/simple/ --trusted-host pypi.douban.com

COPY . .

CMD [ "flask", "run" , "--host=0.0.0.0"]
