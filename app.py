from flask import Flask # type: ignore

app = Flask(__name__)

@app.route("/")
def home():
    return "changes made by github, this is DevOps site!"

if __name__ == "__main__":
    app.run(host="0.0.0.0", port=5000)
