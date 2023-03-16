const storage = {
    set(key, value) {
        localStorage.setItem(key, JSON.stringify(value));
    },
    get(key) {
        return localStorage.getItem(key)?localStorage.getItem(key).replace('"','').replace('"',''):"";
    },
    getObj(key) {
        return localStorage.getItem(key)?JSON.parse(localStorage.getItem(key)):null;
    },
    remove(key) {
        localStorage.removeItem(key);
    }
}
export default storage;