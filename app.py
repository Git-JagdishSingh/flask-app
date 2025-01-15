from flask import Flask # type: ignore

app = Flask(__name__)

@app.route("/")
def home():
<<<<<<< HEAD
    return "Hello Users, DevOps site!"

if __name__ == "__main__":
    app.run(host="0.0.0.0", port=5000)
=======
    return "Hello, DevOps!"

if __name__ == "__main__":
    app.run(host="0.0.0.0", port=5000)
>>>>>>> c9897c4 (initial commit)
