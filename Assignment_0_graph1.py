import matplotlib.pyplot as plt

x=[0.10, 0.25, 0.40, 0.55, 0.70, 0.85]
y=[48, 52, 81, 116, 220, 856]
plt.plot(x,y)
plt.xlabel("probability(p)")
plt.ylabel("time(t)")
plt.title("time vs probability\n when width(w)=5")
plt.show()
