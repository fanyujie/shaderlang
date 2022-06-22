import glob, os, shutil

source_dir="./src"
dest_dir='./include'
files = glob.iglob(os.path.join(source_dir, "*.h"))
for file in files:
    if os.path.isfile(file):
        shutil.copy2(file, dest_dir)