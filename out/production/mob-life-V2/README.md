# mob-life-V2
# Java Classes

- [o] Main
    - [o] use cases:
        - [X] Login
        - [X] Register
        - [X] create avatar
        - [X] edit avatar
        - [ ] logout - jonathan
        - [ ] crime - liam
        - [ ] manage Inventory
        - [ ] chat room
- [X] Register
- [X] Login
    - [X] Update error messages
- [X] Character
- [ ] Mission
- [ ] Mission Tracker
- [ ] Inventory
- [ ] Item
    - [ ] Weapon
    - [ ] Clothing
    - [ ] Accessory
    - [ ] Food

# Group Git Workflow Guide

This guide outlines the workflow for collaborating on a project using Git and GitHub within your group.

## 1. Clone the Repository

Start by cloning the repository from GitHub to your local machine.

```bash
git clone <repository_url>
```

## 2. Create a Branch

Create a new branch for the feature or bug fix you're working on.
```bash
git checkout -b feature_branch
```

## 3. Make Changes
Write your code or make the necessary changes to the files in your local branch.

## 4. Stage and Commit Changes

Stage your changes and commit them with a descriptive message.
```bash
git add .
git commit -m "Description of changes"
```

## 5. Pull Latest Changes from Remote

Pull the latest changes from the remote repository to ensure you're up-to-date.
```bash
git pull origin main
```

## 6. Resolve Conflicts (if any)

Resolve any Conflicts between your changes and the latest changes from the remote.

## 7. Push Changes to Remote

Push your changes to the remote repository.

```bash
git push origin feature_branch
```

## 8. Create Pull Request

Create a pull request from you feature branch o the main branch on GitHub. Provide a clear description of your changes.

## 9. Review and Merge

Reviewers can approve your pull request, leave comments, and suggest changes if necessary. Once approved, merge the pull request into the main branch.

## 10. Cleanup

Delete the feature branch both locally and on the remote repository after merging.
```bash
git checkout main
git branch -d feature_branch
push origin --delete feature_branch
```

## 11. Update Local Repository

Finally, update your local repository with the latest changes from the main branch.
```bash
git pull origin main
```
